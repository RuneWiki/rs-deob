package deob;

@ObfuscatedName("bp")
public class class39 extends class50 {

    @ObfuscatedName("bp.am")
    public class394 field262 = new class394();

    @ObfuscatedName("bp.ap")
    public class394 field260 = new class394();

    @ObfuscatedName("bp.af")
    public int field261 = 0;

    @ObfuscatedName("bp.aj")
    public int field263 = -1;

    @ObfuscatedName("bp.am(Lbl;)V")
    public final synchronized void method732(class50 arg0) {
        this.field262.method6672(arg0);
    }

    @ObfuscatedName("bp.ap(Lbl;)V")
    public final synchronized void method734(class50 arg0) {
        arg0.method7988();
    }

    @ObfuscatedName("bp.af()V")
    public void method741() {
        if (this.field261 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field260.method6670(); var1 != null; var1 = (class56) this.field260.method6665()) {
            var1.field403 -= this.field261;
        }
        this.field263 -= this.field261;
        this.field261 = 0;
    }

    @ObfuscatedName("bp.aj(Lse;Lcv;)V")
    public void method765(class489 arg0, class56 arg1) {
        while (this.field260.field4475 != arg0 && ((class56) arg0).field403 <= arg1.field403) {
            arg0 = arg0.field4888;
        }
        class394.method6667(arg1, arg0);
        this.field263 = ((class56) this.field260.field4475.field4888).field403;
    }

    @ObfuscatedName("bp.aq(Lcv;)V")
    public void method737(class56 arg0) {
        arg0.method7988();
        arg0.method1075();
        class489 var2 = this.field260.field4475.field4888;
        if (this.field260.field4475 == var2) {
            this.field263 = -1;
        } else {
            this.field263 = ((class56) var2).field403;
        }
    }

    @ObfuscatedName("bp.ar()Lbl;")
    public class50 method738() {
        return (class50) this.field262.method6670();
    }

    @ObfuscatedName("bp.ag()Lbl;")
    public class50 method766() {
        return (class50) this.field262.method6665();
    }

    @ObfuscatedName("bp.ao()I")
    public int method740() {
        return 0;
    }

    @ObfuscatedName("bp.ae([III)V")
    public final synchronized void method736(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field263 < 0) {
                this.method742(arg0, arg1, arg2);
                return;
            }
            if (this.field261 + arg2 < this.field263) {
                this.field261 += arg2;
                this.method742(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field263 - this.field261;
            this.method742(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field261 += var4;
            this.method741();
            class56 var5 = (class56) this.field260.method6670();
            synchronized (var5) {
                int var7 = var5.method1076(this);
                if (var7 < 0) {
                    var5.field403 = 0;
                    this.method737(var5);
                } else {
                    var5.field403 = var7;
                    this.method765(var5.field4888, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bp.aa([III)V")
    public void method742(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field262.method6670(); var4 != null; var4 = (class50) this.field262.method6665()) {
            var4.method1020(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bp.au(I)V")
    public final synchronized void method743(int arg0) {
        do {
            if (this.field263 < 0) {
                this.method748(arg0);
                return;
            }
            if (this.field261 + arg0 < this.field263) {
                this.field261 += arg0;
                this.method748(arg0);
                return;
            }
            int var2 = this.field263 - this.field261;
            this.method748(var2);
            arg0 -= var2;
            this.field261 += var2;
            this.method741();
            class56 var3 = (class56) this.field260.method6670();
            synchronized (var3) {
                int var5 = var3.method1076(this);
                if (var5 < 0) {
                    var3.field403 = 0;
                    this.method737(var3);
                } else {
                    var3.field403 = var5;
                    this.method765(var3.field4888, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bp.an(I)V")
    public void method748(int arg0) {
        for (class50 var2 = (class50) this.field262.method6670(); var2 != null; var2 = (class50) this.field262.method6665()) {
            var2.method743(arg0);
        }
    }
}
