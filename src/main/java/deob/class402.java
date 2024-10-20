package deob;

@ObfuscatedName("pj")
public class class402 extends class408 {

    public class402(class408 arg0) {
        super(arg0);
        this.field4529 = "SwapSongTask";
    }

    @ObfuscatedName("pj.aw(II)Z")
    public boolean method6944(int arg0) {
        if (class307.field3395.size() > 1 && class307.field3395.get(0) != null && ((class319) class307.field3395.get(0)).field3517.method5264() && class307.field3395.get(1) != null && ((class319) class307.field3395.get(1)).field3517.method5264()) {
            class319 var2 = (class319) class307.field3395.get(0);
            class307.field3395.set(0, class307.field3395.get(1));
            class307.field3395.set(1, var2);
        }
        return true;
    }
}
