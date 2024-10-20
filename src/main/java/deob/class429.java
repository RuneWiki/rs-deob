package deob;

@ObfuscatedName("qc")
public class class429 extends class435 {

    @ObfuscatedName("qc.ae")
    public final class493 field4637;

    @ObfuscatedName("qc.ao")
    public final class427 field4643;

    @ObfuscatedName("qc.at")
    public String field4636 = null;

    @ObfuscatedName("qc.ac")
    public String field4640 = null;

    @ObfuscatedName("qc.ai")
    public byte field4641;

    @ObfuscatedName("qc.az")
    public int field4642;

    @ObfuscatedName("qc.ap")
    public int field4639 = 1;

    public class429(class493 arg0, class427 arg1) {
        super(500);
        this.field4637 = arg0;
        this.field4643 = arg1;
    }

    @ObfuscatedName("qc.au(I)Lqs;")
    public class433 method7188() {
        return new class432();
    }

    @ObfuscatedName("qc.ae(IB)[Lqs;")
    public class433[] method7185(int arg0) {
        return new class432[arg0];
    }

    @ObfuscatedName("qc.ao(Ljava/lang/String;I)V")
    public final void method7203(String arg0) {
        this.field4636 = class389.method6579(arg0);
    }

    @ObfuscatedName("qc.az(Ljava/lang/String;I)V")
    public final void method7204(String arg0) {
        this.field4640 = class389.method6579(arg0);
    }

    @ObfuscatedName("qc.ap(Ltm;II)V")
    public final void method7205(class515 arg0, int arg1) {
        this.method7204(arg0.method8311());
        long var3 = arg0.method8307();
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
                var11.append(class389.field4434[(int) (var12 - var5 * 37L)]);
            }
            var7 = var11.reverse().toString();
        }
        this.method7203(var7);
        this.field4641 = arg0.method8301();
        int var14;
        short var15;
        if (arg1 == 1) {
            var14 = arg0.method8300();
            var15 = 255;
        } else if (arg1 == 2) {
            var14 = arg0.method8317();
            var15 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var14 == var15) {
            return;
        }
        int var16 = var14;
        this.method7272();
        for (int var17 = 0; var17 < var16; var17++) {
            class432 var18 = (class432) this.method7296(new class538(arg0.method8311(), this.field4637));
            int var19 = arg0.method8448();
            var18.method7352(var19, ++this.field4639 - 1);
            var18.field4672 = arg0.method8301();
            arg0.method8311();
            this.method7209(var18);
        }
    }

    @ObfuscatedName("qc.aa(Ltm;B)V")
    public final void method7206(class515 arg0) {
        class538 var2 = new class538(arg0.method8311(), this.field4637);
        int var3 = arg0.method8448();
        byte var4 = arg0.method8301();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method7328() == 0) {
                return;
            }
            class432 var6 = (class432) this.method7277(var2);
            if (var6 != null && var6.method7353() == var3) {
                this.method7280(var6);
            }
            return;
        }
        arg0.method8311();
        class432 var7 = (class432) this.method7277(var2);
        if (var7 == null) {
            if (this.method7328() > this.field4664) {
                return;
            }
            var7 = (class432) this.method7296(var2);
        }
        var7.method7352(var3, ++this.field4639 - 1);
        var7.field4672 = var4;
        this.method7209(var7);
    }

    @ObfuscatedName("qc.af(B)V")
    public final void method7207() {
        for (int var1 = 0; var1 < this.method7328(); var1++) {
            ((class432) this.method7285(var1)).method7233();
        }
    }

    @ObfuscatedName("qc.ad(B)V")
    public final void method7202() {
        for (int var1 = 0; var1 < this.method7328(); var1++) {
            ((class432) this.method7285(var1)).method7245();
        }
    }

    @ObfuscatedName("qc.aq(Lqx;I)V")
    public final void method7209(class432 arg0) {
        if (arg0.method7250().equals(this.field4643.method1210())) {
            this.field4642 = arg0.field4672;
        }
    }
}
