package deob;

@ObfuscatedName("rf")
public class class456 {

    @ObfuscatedName("rf.ap")
    public long field4929 = -1L;

    @ObfuscatedName("rf.aw")
    public long field4921 = -1L;

    @ObfuscatedName("rf.ak")
    public boolean field4922 = false;

    @ObfuscatedName("rf.aj")
    public long field4923 = 0L;

    @ObfuscatedName("rf.ai")
    public long field4920 = 0L;

    @ObfuscatedName("rf.ay")
    public long field4925 = 0L;

    @ObfuscatedName("rf.as")
    public int field4926 = 0;

    @ObfuscatedName("rf.ae")
    public int field4927 = 0;

    @ObfuscatedName("rf.am")
    public int field4928 = 0;

    @ObfuscatedName("rf.at")
    public int field4931 = 0;

    @ObfuscatedName("rf.ap(I)V")
    public void method8142() {
        this.field4929 = class330.method2257();
    }

    @ObfuscatedName("rf.aw(S)V")
    public void method8124() {
        if (this.field4929 != -1L) {
            this.field4920 = class330.method2257() - this.field4929;
            this.field4929 = -1L;
        }
    }

    @ObfuscatedName("rf.ak(IS)V")
    public void method8125(int arg0) {
        this.field4921 = class330.method2257();
        this.field4926 = arg0;
    }

    @ObfuscatedName("rf.aj(I)V")
    public void method8126() {
        if (this.field4921 != -1L) {
            this.field4923 = class330.method2257() - this.field4921;
            this.field4921 = -1L;
        }
        this.field4928++;
        this.field4922 = true;
    }

    @ObfuscatedName("rf.ai(I)V")
    public void method8127() {
        this.field4922 = false;
        this.field4927 = 0;
    }

    @ObfuscatedName("rf.ay(B)V")
    public void method8128() {
        this.method8126();
    }

    @ObfuscatedName("rf.as(Lvl;B)V")
    public void method8140(class558 arg0) {
        method1161(arg0, this.field4920);
        method1161(arg0, this.field4923);
        method1161(arg0, this.field4925);
        arg0.method9257(this.field4926);
        arg0.method9257(this.field4927);
        arg0.method9257(this.field4928);
        arg0.method9257(this.field4931);
    }

    @ObfuscatedName("cu.ae(Lvl;J)V")
    public static void method1161(class558 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method9257((int) var3);
    }
}
