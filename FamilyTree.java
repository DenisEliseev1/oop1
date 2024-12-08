public class FamilyTree {

    public boolean check (Person pers1, Person pers2) {
        boolean ch = false;
        if ((pers1.getSurname () == pers2.getSurname()) && (pers1.getName()== pers2.getNameFather()) 
        && ((pers1.getAges() - pers2.getAges()) > 20)) {
            ch = true;
        }
        return ch;
    }
}