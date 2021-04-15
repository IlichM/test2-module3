package one;

class Knight {
    public String name = "Sir Thanks-A-Lot";
    private String weapon = "Long Sword";
    private boolean isGoingToSavePrincess = true;

    public static void main(String[] args) {
        Cookie cookie = new Cookie();
        cookie.print();

    }

    public void goAndSaveThePrincess() {
        sharpenBlade();
        getFood();
        assembleTeam();
        System.out.println("Да иду уже...");
    }

    public void sharpenBlade() { System.out.println("Точим мечь"); }

    private void getFood() { System.out.println("Собираем консервы"); }

    private void assembleTeam() { System.out.println("Будим оруженосца"); }
}
