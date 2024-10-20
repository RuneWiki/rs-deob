package deob;

@ObfuscatedName("be")
public class class39 extends class50 {

    @ObfuscatedName("be.at")
    public class376 field257 = new class376();

    @ObfuscatedName("be.an")
    public class376 field256 = new class376();

    @ObfuscatedName("be.av")
    public int field258 = 0;

    @ObfuscatedName("be.as")
    public int field259 = -1;

    @ObfuscatedName("be.at(Lby;)V")
    public final synchronized void method665(class50 arg0) {
        this.field257.method6305(arg0);
    }

    @ObfuscatedName("be.an(Lby;)V")
    public final synchronized void method676(class50 arg0) {
        arg0.method7560();
    }

    @ObfuscatedName("be.av()V")
    public void method667() {
        if (this.field258 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field256.method6309(); var1 != null; var1 = (class57) this.field256.method6311()) {
            var1.field408 -= this.field258;
        }
        this.field259 -= this.field258;
        this.field258 = 0;
    }

    @ObfuscatedName("be.as(Lrz;Lcw;)V")
    public void method668(class461 arg0, class57 arg1) {
        while (this.field256.field4376 != arg0 && ((class57) arg0).field408 <= arg1.field408) {
            arg0 = arg0.field4756;
        }
        class376.method6344(arg1, arg0);
        this.field259 = ((class57) this.field256.field4376.field4756).field408;
    }

    @ObfuscatedName("be.ax(Lcw;)V")
    public void method669(class57 arg0) {
        arg0.method7560();
        arg0.method1004();
        class461 var2 = this.field256.field4376.field4756;
        if (this.field256.field4376 == var2) {
            this.field259 = -1;
        } else {
            this.field259 = ((class57) var2).field408;
        }
    }

    @ObfuscatedName("be.ap()Lby;")
    public class50 method701() {
        return (class50) this.field257.method6309();
    }

    @ObfuscatedName("be.ab()Lby;")
    public class50 method702() {
        return (class50) this.field257.method6311();
    }

    @ObfuscatedName("be.ak()I")
    public int method672() {
        return 0;
    }

    @ObfuscatedName("be.ae([III)V")
    public final synchronized void method677(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field259 < 0) {
                this.method692(arg0, arg1, arg2);
                return;
            }
            if (this.field258 + arg2 < this.field259) {
                this.field258 += arg2;
                this.method692(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field259 - this.field258;
            this.method692(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field258 += var4;
            this.method667();
            class57 var5 = (class57) this.field256.method6309();
            synchronized (var5) {
                int var7 = var5.method1007(this);
                if (var7 < 0) {
                    var5.field408 = 0;
                    this.method669(var5);
                } else {
                    var5.field408 = var7;
                    this.method668(var5.field4756, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("be.af([III)V")
    public void method692(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field257.method6309(); var4 != null; var4 = (class50) this.field257.method6311()) {
            var4.method952(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("be.ao(I)V")
    public final synchronized void method674(int arg0) {
        do {
            if (this.field259 < 0) {
                this.method696(arg0);
                return;
            }
            if (this.field258 + arg0 < this.field259) {
                this.field258 += arg0;
                this.method696(arg0);
                return;
            }
            int var2 = this.field259 - this.field258;
            this.method696(var2);
            arg0 -= var2;
            this.field258 += var2;
            this.method667();
            class57 var3 = (class57) this.field256.method6309();
            synchronized (var3) {
                int var5 = var3.method1007(this);
                if (var5 < 0) {
                    var3.field408 = 0;
                    this.method669(var3);
                } else {
                    var3.field408 = var5;
                    this.method668(var3.field4756, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("be.aa(I)V")
    public void method696(int arg0) {
        for (class50 var2 = (class50) this.field257.method6309(); var2 != null; var2 = (class50) this.field257.method6311()) {
            var2.method674(arg0);
        }
    }
}
