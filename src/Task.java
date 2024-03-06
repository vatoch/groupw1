public abstract class Task {
    private String name;
    private String description;
    private String creatorUsername;


    public Task(String name, String description, String creatorUsername) {
        this.name = name;
        this.description = description;
        this.creatorUsername = creatorUsername;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatorUsername() {
        return creatorUsername;
    }

    public void setCreatorUsername(String creatorUsername) {
        this.creatorUsername = creatorUsername;
    }

    @Override
    public String toString() {
        return "Name : " + name + ",Description : " + description + ",Creator : " + creatorUsername;
    }

}

