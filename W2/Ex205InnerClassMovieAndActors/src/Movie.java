public class Movie {
    public class Actor {
        private String name;

        public Actor(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
    private String title;
    private int year;
    private Actor leadingRole;
    private Actor supportingRole;



    public Movie(String title, int year, String leadingRoleName, String supportingRoleName) {
        this.title = title;
        this.year = year;
        if(leadingRoleName==null) {
            this.leadingRole = null;
        }else {
            this.leadingRole = new Actor(leadingRoleName);
        }
        if(supportingRoleName==null) {
            this.supportingRole = null;
        }else {
            this.supportingRole = new Actor(supportingRoleName);
        }

    }

    public Movie(String title, int year) {
        this(title, year,null, null );
    }

    public Movie(String title) {
        this(title, 0,null,null);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Actor getLeadingRole() {
        return leadingRole;
    }

    public void setLeadingRole(Actor leadingRole) {
        this.leadingRole = leadingRole;
    }

    public Actor getSupportingRole() {
        return supportingRole;
    }

    public void setSupportingRole(Actor supportingRole) {
        this.supportingRole = supportingRole;
    }

    @Override
    public String toString() {
        return String.format("Title: %s ; Year: %d ; Cast: %s,%s", title,year, leadingRole, supportingRole);


    }






}
