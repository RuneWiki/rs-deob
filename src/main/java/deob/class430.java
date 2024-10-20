package deob;

@ObfuscatedName("qk")
public class class430 extends class436 {

    @ObfuscatedName("qk.ay")
    public final class494 field4638;

    @ObfuscatedName("qk.ar")
    public final class428 field4642;

    @ObfuscatedName("qk.am")
    public String field4641 = null;

    @ObfuscatedName("qk.as")
    public String field4639 = null;

    @ObfuscatedName("qk.aj")
    public byte field4643;

    @ObfuscatedName("qk.ag")
    public int field4645;

    @ObfuscatedName("qk.az")
    public int field4640 = 1;

    public class430(class494 arg0, class428 arg1) {
        super(500);
        this.field4638 = arg0;
        this.field4642 = arg1;
    }

    @ObfuscatedName("qk.aw(S)Lqe;")
    public class434 method7164() {
        return new class433();
    }

    @ObfuscatedName("qk.ay(IB)[Lqe;")
    public class434[] method7163(int arg0) {
        return new class433[arg0];
    }

    @ObfuscatedName("qk.ar(Ljava/lang/String;I)V")
    public final void method7178(String arg0) {
        this.field4641 = Statics.method5444(arg0);
    }

    @ObfuscatedName("qk.ag(Ljava/lang/String;I)V")
    public final void method7179(String arg0) {
        this.field4639 = Statics.method5444(arg0);
    }

    @ObfuscatedName("qk.az(Lty;II)V")
    public final void method7180(class514 arg0, int arg1) {
        this.method7179(arg0.method8369());
        long var3 = arg0.method8251();
        long var5 = var3;
        String var7;
        if (var3 <= 0L || var3 >= 6582952005840035281L) {
            var7 = null;
        } else if (var3 % 37L == 0L) {
            var7 = null;
        } else {
            int var8 = 0;
            for (long var9 = var3; var9 != 0L; var9 /= 37L) {
                var8++;
            }
            StringBuilder var11 = new StringBuilder(var8);
            while (var5 != 0L) {
                long var12 = var5;
                var5 /= 37L;
                var11.append(class390.field4443[(int) (var12 - var5 * 37L)]);
            }
            var7 = var11.reverse().toString();
        }
        this.method7178(var7);
        this.field4643 = arg0.method8264();
        int var14;
        short var15;
        if (arg1 == 1) {
            var14 = arg0.method8244();
            var15 = 255;
        } else if (arg1 == 2) {
            var14 = arg0.method8419();
            var15 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var14 == var15) {
            return;
        }
        int var16 = var14;
        this.method7322();
        for (int var17 = 0; var17 < var16; var17++) {
            class433 var18 = (class433) this.method7268(new class538(arg0.method8369(), this.field4638));
            int var19 = arg0.method8246();
            var18.method7330(var19, ++this.field4640 - 1);
            var18.field4671 = arg0.method8264();
            arg0.method8369();
            this.method7184(var18);
        }
    }

    @ObfuscatedName("qk.av(Lty;I)V")
    public final void method7187(class514 arg0) {
        class538 var2 = new class538(arg0.method8369(), this.field4638);
        int var3 = arg0.method8246();
        byte var4 = arg0.method8264();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method7308() == 0) {
                return;
            }
            class433 var6 = (class433) this.method7264(var2);
            if (var6 != null && var6.method7340() == var3) {
                this.method7267(var6);
            }
            return;
        }
        arg0.method8369();
        class433 var7 = (class433) this.method7264(var2);
        if (var7 == null) {
            if (this.method7308() > this.field4662) {
                return;
            }
            var7 = (class433) this.method7268(var2);
        }
        var7.method7330(var3, ++this.field4640 - 1);
        var7.field4671 = var4;
        this.method7184(var7);
    }

    @ObfuscatedName("qk.ap(I)V")
    public final void method7182() {
        for (int var1 = 0; var1 < this.method7308(); var1++) {
            ((class433) this.method7270(var1)).method7231();
        }
    }

    @ObfuscatedName("qk.aq(B)V")
    public final void method7183() {
        for (int var1 = 0; var1 < this.method7308(); var1++) {
            ((class433) this.method7270(var1)).method7218();
        }
    }

    @ObfuscatedName("qk.at(Lqg;B)V")
    public final void method7184(class433 arg0) {
        if (arg0.method7233().equals(this.field4642.method1220())) {
            this.field4645 = arg0.field4671;
        }
    }
}
