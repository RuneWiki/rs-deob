package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ae")
public class class33 {

    @ObfuscatedName("ae.d")
    public int field427 = -1;

    @ObfuscatedName("ae.q")
    public String field425;

    @ObfuscatedName("ae.x")
    public String field426;

    @ObfuscatedName("ae.y")
    public int field439 = -1;

    @ObfuscatedName("ae.e")
    public int field424 = -1;

    @ObfuscatedName("ae.f")
    public class213 field437 = null;

    @ObfuscatedName("ae.v")
    public int field430 = Integer.MAX_VALUE;

    @ObfuscatedName("ae.t")
    public int field431 = 0;

    @ObfuscatedName("ae.i")
    public int field432 = Integer.MAX_VALUE;

    @ObfuscatedName("ae.r")
    public int field433 = 0;

    @ObfuscatedName("ae.g")
    public boolean field429 = false;

    @ObfuscatedName("ae.s")
    public LinkedList field435;

    @ObfuscatedName("ae.d(Lfw;II)V")
    public void method284(class174 arg0, int arg1) {
        this.field427 = arg1;
        this.field425 = arg0.method2922();
        this.field426 = arg0.method2922();
        this.field437 = new class213(arg0.method2935());
        this.field439 = arg0.method2935();
        arg0.method2921();
        this.field429 = arg0.method2921() == 1;
        this.field424 = arg0.method2921();
        int var3 = arg0.method2921();
        this.field435 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field435.add(this.method240(arg0));
        }
        this.method245();
    }

    @ObfuscatedName("ae.q(Lfw;B)Lan;")
    public class43 method240(class174 arg0) {
        int var2 = arg0.method2921();
        class28[] var3 = new class28[] { class28.field368, class28.field378, class28.field370, class28.field369 };
        class28 var4 = (class28) class169.method2811(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field372) {
            case 0:
                var6 = new class49();
                break;
            case 1:
                var6 = new class31();
                break;
            case 2:
                var6 = new class39();
                break;
            case 3:
                var6 = new class27();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var6).method194(arg0);
        return (class43) var6;
    }

    @ObfuscatedName("ae.x(IIIB)Z")
    public boolean method241(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field435.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method191(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ae.y(III)Z")
    public boolean method242(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field430 || var3 > this.field431) {
            return false;
        } else if (var4 >= this.field432 && var4 <= this.field433) {
            Iterator var5 = this.field435.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method169(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ae.e(IIII)[I")
    public int[] method243(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field435.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method191(arg0, arg1, arg2));
        return var5.method170(arg0, arg1, arg2);
    }

    @ObfuscatedName("ae.f(III)Lhy;")
    public class213 method244(int arg0, int arg1) {
        Iterator var3 = this.field435.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method169(arg0, arg1));
        return var4.method177(arg0, arg1);
    }

    @ObfuscatedName("ae.v(I)V")
    public void method245() {
        Iterator var1 = this.field435.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method167(this);
        }
    }

    @ObfuscatedName("ae.t(I)I")
    public int method238() {
        return this.field427;
    }

    @ObfuscatedName("ae.i(S)Z")
    public boolean method316() {
        return this.field429;
    }

    @ObfuscatedName("ae.r(I)Ljava/lang/String;")
    public String method248() {
        return this.field425;
    }

    @ObfuscatedName("ae.g(I)Ljava/lang/String;")
    public String method249() {
        return this.field426;
    }

    @ObfuscatedName("ae.s(I)I")
    public int method250() {
        return this.field439;
    }

    @ObfuscatedName("ae.o(B)I")
    public int method251() {
        return this.field424;
    }

    @ObfuscatedName("ae.p(I)I")
    public int method252() {
        return this.field430;
    }

    @ObfuscatedName("ae.u(I)I")
    public int method253() {
        return this.field431;
    }

    @ObfuscatedName("ae.b(I)I")
    public int method282() {
        return this.field432;
    }

    @ObfuscatedName("ae.w(B)I")
    public int method239() {
        return this.field433;
    }

    @ObfuscatedName("ae.k(I)I")
    public int method255() {
        return this.field437.field2592;
    }

    @ObfuscatedName("ae.c(S)I")
    public int method259() {
        return this.field437.field2591;
    }

    @ObfuscatedName("ae.h(I)I")
    public int method257() {
        return this.field437.field2593;
    }

    @ObfuscatedName("ae.z(I)Lhy;")
    public class213 method281() {
        return new class213(this.field437);
    }
}
