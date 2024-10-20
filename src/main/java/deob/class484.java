package deob;

@ObfuscatedName("sq")
public class class484 extends class483 {

    @ObfuscatedName("sq.ap")
    public static final int field5048 = client.field727 + 3;

    @ObfuscatedName("sq.aw")
    public final class275 field5044 = new class275();

    @ObfuscatedName("sq.ak")
    public final class275 field5045 = new class275();

    @ObfuscatedName("sq.aj")
    public int field5043 = 0;

    @ObfuscatedName("sq.ai")
    public int field5046 = 0;

    @ObfuscatedName("sq.ap(Lkt;Lsb;II)V")
    public void method8480(class275 arg0, class482 arg1, int arg2) {
        this.field5044.method5351(arg0);
        this.field5045.method5351(arg1.field5041);
        this.field5043 = arg2 - 1;
        this.field5046 = field5048 + arg1.field5042;
    }

    @ObfuscatedName("sq.aw(Lkt;IIB)Z")
    public boolean method8487(class275 arg0, int arg1, int arg2) {
        if (this.field5043 >= this.field5046) {
            arg0.method5351(this.field5045);
            return true;
        } else {
            float var4 = class483.method8452(arg1, this.field5043, this.field5046);
            method7724(this.field5044, this.field5045, var4, arg0);
            return var4 >= 1.0F;
        }
    }

    @ObfuscatedName("sq.ak(III)V")
    public void method8476(int arg0, int arg1) {
        this.field5044.method5355(arg0, arg1);
        this.field5045.method5355(arg0, arg1);
    }

    @ObfuscatedName("qc.ar(Lkt;Lkt;FLkt;I)V")
    public static void method7724(class275 arg0, class275 arg1, float arg2, class275 arg3) {
        float var4 = class332.method1218(0.0F, 1.0F, arg2);
        int var5 = arg1.method5345() - arg0.method5345();
        int var6 = arg1.method5347() - arg0.method5347();
        int var7 = (int) ((float) var5 * var4);
        int var8 = (int) ((float) var6 * var4);
        arg3.method5380(arg0.method5345() + var7, arg0.method5347() + var8);
        int var9 = class508.method5247(arg0.method5361(), arg1.method5361());
        int var10 = (int) ((float) var9 * var4);
        arg3.method5353(arg0.method5361() + var10);
    }
}
