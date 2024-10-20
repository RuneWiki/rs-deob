package deob;

@ObfuscatedName("rr")
public class class468 extends class474 {

    @ObfuscatedName("rr.ay")
    public final class526 field4906;

    @ObfuscatedName("rr.an")
    public final class466 field4904;

    @ObfuscatedName("rr.au")
    public String field4905 = null;

    @ObfuscatedName("rr.ax")
    public String field4907 = null;

    @ObfuscatedName("rr.ao")
    public byte field4902;

    @ObfuscatedName("rr.am")
    public int field4908;

    @ObfuscatedName("rr.ac")
    public int field4909 = 1;

    public class468(class526 arg0, class466 arg1) {
        super(500);
        this.field4906 = arg0;
        this.field4904 = arg1;
    }

    @ObfuscatedName("rr.ab(I)Lsz;")
    public class472 method7861() {
        return new class471();
    }

    @ObfuscatedName("rr.ay(IB)[Lsz;")
    public class472[] method7862(int arg0) {
        return new class471[arg0];
    }

    @ObfuscatedName("rr.an(Ljava/lang/String;I)V")
    public final void method7879(String arg0) {
        this.field4905 = class419.method2236(arg0);
    }

    @ObfuscatedName("rr.ad(Ljava/lang/String;I)V")
    public final void method7900(String arg0) {
        this.field4907 = class419.method2236(arg0);
    }

    @ObfuscatedName("rr.aq(Lvg;IB)V")
    public final void method7888(class549 arg0, int arg1) {
        this.method7900(arg0.method8808());
        long var3 = arg0.method8804();
        this.method7879(class419.method4128(var3));
        this.field4902 = arg0.method8798();
        int var5;
        short var6;
        if (arg1 == 1) {
            var5 = arg0.method9025();
            var6 = 255;
        } else if (arg1 == 2) {
            var5 = arg0.method8840();
            var6 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var5 == var6) {
            return;
        }
        int var7 = var5;
        this.method7980();
        for (int var8 = 0; var8 < var7; var8++) {
            class471 var9 = (class471) this.method7963(new class572(arg0.method8808(), this.field4906));
            int var10 = arg0.method8968();
            var9.method8033(var10, ++this.field4909 - 1);
            var9.field4936 = arg0.method8798();
            arg0.method8808();
            this.method7884(var9);
        }
    }

    @ObfuscatedName("rr.al(Lvg;I)V")
    public final void method7882(class549 arg0) {
        class572 var2 = new class572(arg0.method8808(), this.field4906);
        int var3 = arg0.method8968();
        byte var4 = arg0.method8798();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method8008() == 0) {
                return;
            }
            class471 var6 = (class471) this.method7959(var2);
            if (var6 != null && var6.method8045() == var3) {
                this.method7955(var6);
            }
            return;
        }
        arg0.method8808();
        class471 var7 = (class471) this.method7959(var2);
        if (var7 == null) {
            if (this.method8008() > this.field4930) {
                return;
            }
            var7 = (class471) this.method7963(var2);
        }
        var7.method8033(var3, ++this.field4909 - 1);
        var7.field4936 = var4;
        this.method7884(var7);
    }

    @ObfuscatedName("rr.aj(B)V")
    public final void method7881() {
        for (int var1 = 0; var1 < this.method8008(); var1++) {
            ((class471) this.method7964(var1)).method7914();
        }
    }

    @ObfuscatedName("rr.as(I)V")
    public final void method7878() {
        for (int var1 = 0; var1 < this.method8008(); var1++) {
            ((class471) this.method7964(var1)).method7917();
        }
    }

    @ObfuscatedName("rr.aw(Lse;I)V")
    public final void method7884(class471 arg0) {
        if (arg0.method7944().equals(this.field4904.method1187())) {
            this.field4908 = arg0.field4936;
        }
    }
}
