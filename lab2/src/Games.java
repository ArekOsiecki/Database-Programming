public class Games {
        private int id = 0;
        private String title = null;
        private String genre = null;

        public Games(){
            setTitle("");
            setGenre("");
        }

        public Games(String title, String genre){
            setTitle(title);
            setGenre(genre);

        }
        public void setTitle(String title) {this.title = title;}
        public String getTitle(String  title) {return title;}
        public void setGenre(String genre) {this.genre = genre;}
        public String getGenre(String genre) {return genre;}
}
