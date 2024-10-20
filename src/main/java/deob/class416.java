package deob;

@ObfuscatedName("pz")
public class class416 extends class422 {

    public class416(class422 arg0) {
        super(arg0);
        this.field4573 = "SwapSongTask";
    }

    @ObfuscatedName("pz.ac(B)Z")
    public boolean method7059() {
        if (class320.field3434.size() > 1 && class320.field3434.get(0) != null && ((class332) class320.field3434.get(0)).field3539.method5418() && class320.field3434.get(1) != null && ((class332) class320.field3434.get(1)).field3539.method5418()) {
            class332 var1 = (class332) class320.field3434.get(0);
            class320.field3434.set(0, class320.field3434.get(1));
            class320.field3434.set(1, var1);
        }
        return true;
    }
}
