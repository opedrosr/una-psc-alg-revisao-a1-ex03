public class RevisaoEcom {
    public static void main(String[] args) {

        
        int[] notasRisco = {15, 35, 50, 80, 95, 10, 20, 45, 60, 75, 85, 90, 30, 55, 100};

        
        double somaPonderada = 0;
        int somaPesos = 0;

        for (int i = 0; i < notasRisco.length; i++) {
            int peso;

           
            if (i >= 0 && i <= 4) {
                peso = 3;
            } else {
                peso = 1;
            }

            somaPonderada += notasRisco[i] * peso;
            somaPesos += peso;
        }

        double mediaPonderada = somaPonderada / somaPesos;

       
        int otimistas = 0;
        int alarmantes = 0;

        for (int nota : notasRisco) {
            if (nota <= 20) {
                otimistas++;
            } else if (nota >= 90) {
                alarmantes++;
            }
        }

        System.out.println("Processamento da Análise de Risco:");
        System.out.println("------------------------------------------");
        System.out.printf("Média Ponderada do Risco: %.2f%n", mediaPonderada);
        System.out.println("Analistas Otimistas (Nota <= 20): " + otimistas);
        System.out.println("Analistas Alarmantes (Nota >= 90): " + alarmantes);
        System.out.println("------------------------------------------");

       
        if (mediaPonderada > 70) {
            System.out.println("Parecer Final: Alto Risco: Venda ou reajuste de portfólio recomendado.");
        } else if (mediaPonderada >= 40 && mediaPonderada <= 70) {
            System.out.println("Parecer Final: Risco Moderado: Acompanhar de perto, mas manter os ativos.");
        } else {
            System.out.println("Parecer Final: Baixo Risco: Excelente momento para capitalização.");
        }
    }
}
