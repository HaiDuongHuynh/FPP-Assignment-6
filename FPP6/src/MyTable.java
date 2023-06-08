public class MyTable {
    Entry[] entries;

    public MyTable(){
        entries = new Entry[26];
    }
    private class Entry{
        private char character;
        private String str;
        Entry(char c, String s){
            this.character = c;
            this.str= s;
        }

        public String toString(){
            return character + "->" + str ;
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Entry e : entries) {
            if (e != null) {
                sb.append(e.toString()).append("\n");
            }
        }
        return sb.toString();

    }

    public void add(char c,String s){
        int index = getIndex(c);
        Entry e = new Entry(c,s);
        entries[index] = e;
    }

    public String get (char c){
        int index = getIndex(c);
        if (entries[index] != null) {
            return entries[index].str;
        }
        return null;
    }
    public int getIndex(char c){
        if(c == 'a'){
            return 0;
        }
        if(c == 'b'){
            return 1;
        }
        if(c == 'c'){
            return 2;
        }
        if(c == 'd'){
            return 3;
        }
        if(c == 'e'){
            return 4;
        }
        if(c == 'f'){
            return 5;
        }
        if(c == 'g'){
            return 6;
        }
        if(c == 'h'){
            return 7;
        }
        if(c == 'i'){
            return 8;
        }
        if(c == 'j') {
            return 9;
        }
        if(c == 'k'){
            return 10;
        }
        if(c == 'l'){
            return 11;
        }
        if(c == 'm'){
            return 12;
        }
        if(c == 'n'){
            return 13;
        }
        if(c == 'o'){
            return 14;
        }
        if(c == 'p'){
            return 15;
        }
        if(c == 'q'){
            return 16;
        }
        if(c == 'r'){
            return 17;
        }
        if(c == 's'){
            return 18;
        }
        if(c == 't'){
            return 19;
        }
        if(c == 'u'){
            return 20;
        }
        if(c == 'v'){
            return 21;
        }
        if(c == 'w'){
            return 22;
        }
        if(c == 'x'){
            return 23;
        }
        if(c == 'y'){
            return 24;
        }
        if(c == 'z'){
            return 25;
        }
        return 0;
    }
}
