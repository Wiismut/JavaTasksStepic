
    public class prob {
        public static void main(String[] args) throws InterruptedException {

            String str1 = "Зуб даю, вы б дали диву:  \n" +
                    "Легенда не проста,  а La Commedia Divina\n" +
                    "И тут ещё поди вопрос               \n" +
                    "Как влюбилась безответно в Океан Богиня Гроз?                  \n" +
                    "И память как стена, не забыть, как не отмыть пятна вина\n" +
                    "История одна, что достойна была всецело кина\n" +
                    "Она себе возжелала в руки сердце Океана\n" +
                    "Окинава дрогнет, грозовые облака её\n" +
                    "Тянутся по морю, как резина, и пока не лёг\n";
            for(char i : str1.toCharArray()){
                System.out.print(i);
                Thread.sleep(100);
            }


        }


    }

