package deob;

@ObfuscatedName("lh")
public class class291 extends class303 {

    @ObfuscatedName("lh.ap")
    public final int field3177;

    @ObfuscatedName("lh.aw")
    public final class298 field3175;

    @ObfuscatedName("lh.ak")
    public final int field3176;

    @ObfuscatedName("lh.aj")
    public final int field3174;

    public class291(class351 arg0, class351 arg1, int arg2, class298 arg3) {
        super(arg0, arg1);
        this.field3177 = arg2;
        this.field3175 = arg3;
        class184 var5 = class184.method174(this.method5469());
        class572 var6 = var5.method3615(false);
        if (var6 == null) {
            this.field3176 = 0;
            this.field3174 = 0;
        } else {
            this.field3176 = var6.field5558;
            this.field3174 = var6.field5559;
        }
    }

    @ObfuscatedName("lh.aw(I)I")
    public int method5469() {
        return this.field3177;
    }

    @ObfuscatedName("lh.ak(S)Llp;")
    public class298 method5473() {
        return this.field3175;
    }

    @ObfuscatedName("lh.aj(I)I")
    public int method5463() {
        return this.field3176;
    }

    @ObfuscatedName("lh.ai(I)I")
    public int method5464() {
        return this.field3174;
    }
}
