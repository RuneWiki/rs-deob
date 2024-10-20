package deob;

@ObfuscatedName("qr")
public class class439 extends class445 {

    public class439(class445 arg0) {
        super(arg0);
        this.field4815 = "SwapSongTask";
    }

    @ObfuscatedName("qr.aq(S)Z")
    public boolean method7560() {
        if (class331.field3585.size() > 1 && class331.field3585.get(0) != null && ((class343) class331.field3585.get(0)).field3714.method5615() && class331.field3585.get(1) != null && ((class343) class331.field3585.get(1)).field3714.method5615()) {
            class343 var1 = (class343) class331.field3585.get(0);
            class331.field3585.set(0, class331.field3585.get(1));
            class331.field3585.set(1, var1);
        }
        return true;
    }
}
