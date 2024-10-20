package deob;

@ObfuscatedName("av")
public class class9 {

    @ObfuscatedName("av.aw")
    public final int field35;

    @ObfuscatedName("av.ay")
    public final int field34;

    @ObfuscatedName("av.ar")
    public final String field36;

    public class9(int arg0, int arg1, String arg2) {
        this.field35 = arg0;
        this.field34 = arg1;
        this.field36 = arg2;
    }

    public class9(class514 arg0) {
        this(arg0.method8244(), arg0.method8244(), arg0.method8369());
    }

    @ObfuscatedName("av.aw()Ljava/lang/String;")
    public String method63() {
        return Integer.toHexString(this.field35) + Integer.toHexString(this.field34) + this.field36;
    }

    @ObfuscatedName("av.ay()I")
    public int method62() {
        return this.field34;
    }
}
