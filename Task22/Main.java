package Task22;

public class Main {
    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.Solve("23*45*+");
        st.Solve("1267-/*");
        st.Solve("43687");
        st.Solve("hjkfd");
        st.Solve("234+++");
        st.Solve("234+-123*+/");
        st.Solve("23+4-");
        st.Solve("23+45-");
        st.Solve("23?56?-");
        st.Solve("23$89^+");
    }
}
