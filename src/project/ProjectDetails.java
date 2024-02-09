package project;

public class ProjectDetails {

        protected String projectName;
        protected String technology;

        @Override
        public String toString() {
            return "ProjectDetails{" +
                    "projectName='" + projectName + '\'' +
                    ", technology='" + technology + '\'' +
                    '}';
        }

        public ProjectDetails(String projectName, String technology) {
            this.projectName = projectName;
            this.technology = technology;

        }
    }

