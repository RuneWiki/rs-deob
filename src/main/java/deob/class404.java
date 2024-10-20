package deob;

@ObfuscatedName("ps")
public class class404 extends class410 {

    @ObfuscatedName("ps.an")
    public final class469 field4562;

    @ObfuscatedName("ps.aw")
    public final class402 field4563;

    @ObfuscatedName("ps.ac")
    public String field4564 = null;

    @ObfuscatedName("ps.au")
    public String field4565 = null;

    @ObfuscatedName("ps.ab")
    public byte field4568;

    @ObfuscatedName("ps.aq")
    public int field4567;

    @ObfuscatedName("ps.al")
    public int field4566 = 1;

    public class404(class469 arg0, class402 arg1) {
        super(500);
        this.field4562 = arg0;
        this.field4563 = arg1;
    }

    @ObfuscatedName("ps.af(I)Lpw;")
    public class408 method7085() {
        return new class407();
    }

    @ObfuscatedName("ps.an(II)[Lpw;")
    public class408[] method7088(int arg0) {
        return new class407[arg0];
    }

    @ObfuscatedName("ps.aw(Ljava/lang/String;I)V")
    public final void method7109(String arg0) {
        this.field4564 = class374.method2029(arg0);
    }

    @ObfuscatedName("ps.ay(Ljava/lang/String;I)V")
    public final void method7116(String arg0) {
        this.field4565 = class374.method2029(arg0);
    }

    @ObfuscatedName("ps.ao(Lsg;IB)V")
    public final void method7111(class489 arg0, int arg1) {
        this.method7116(arg0.method8259());
        long var3 = arg0.method8271();
        this.method7109(Statics.method4639(var3));
        this.field4568 = arg0.method8249();
        int var5;
        short var6;
        if (arg1 == 1) {
            var5 = arg0.method8248();
            var6 = 255;
        } else if (arg1 == 2) {
            var5 = arg0.method8265();
            var6 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var5 == var6) {
            return;
        }
        int var7 = var5;
        this.method7231();
        for (int var8 = 0; var8 < var7; var8++) {
            class407 var9 = (class407) this.method7202(new class513(arg0.method8259(), this.field4562));
            int var10 = arg0.method8250();
            var9.method7279(var10, ++this.field4566 - 1);
            var9.field4599 = arg0.method8249();
            arg0.method8259();
            this.method7113(var9);
        }
    }

    @ObfuscatedName("ps.ax(Lsg;B)V")
    public final void method7115(class489 arg0) {
        class513 var2 = new class513(arg0.method8259(), this.field4562);
        int var3 = arg0.method8250();
        byte var4 = arg0.method8249();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method7195() == 0) {
                return;
            }
            class407 var6 = (class407) this.method7198(var2);
            if (var6 != null && var6.method7272() == var3) {
                this.method7208(var6);
            }
            return;
        }
        arg0.method8259();
        class407 var7 = (class407) this.method7198(var2);
        if (var7 == null) {
            if (this.method7195() > this.field4589) {
                return;
            }
            var7 = (class407) this.method7202(var2);
        }
        var7.method7279(var3, ++this.field4566 - 1);
        var7.field4599 = var4;
        this.method7113(var7);
    }

    @ObfuscatedName("ps.ai(I)V")
    public final void method7112() {
        for (int var1 = 0; var1 < this.method7195(); var1++) {
            ((class407) this.method7220(var1)).method7157();
        }
    }

    @ObfuscatedName("ps.ag(B)V")
    public final void method7114() {
        for (int var1 = 0; var1 < this.method7195(); var1++) {
            ((class407) this.method7220(var1)).method7147();
        }
    }

    @ObfuscatedName("ps.ah(Lpd;I)V")
    public final void method7113(class407 arg0) {
        if (arg0.method7167().equals(this.field4563.method1184())) {
            this.field4567 = arg0.field4599;
        }
    }
}
