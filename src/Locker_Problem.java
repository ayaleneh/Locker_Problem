class Locker {

        public static void main(String[] args) {

            int nbLock = 100;

            boolean[] lock = new boolean[nbLock + 1];

            for(int s = 1; s <= nbLock; ++s) {

                for(int j = s; j <= nbLock; j += s) {

                    lock[j] = !lock[j];

                }

                displayLock(s, lock);

            }
        }
        private static void displayLock(int num, boolean[] lock) {

            System.out.printf("%2d) ", num);

            for(int i = 1; i < lock.length - 1; ++i) {

                if(lock[i])
                System.out.print("o+");
            else
                System.out.print("c-");
            }
            System.out.println();
        }
    }


