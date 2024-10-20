package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ax")
public class class33 {

    @ObfuscatedName("ax.a")
    public int field428 = -1;

    @ObfuscatedName("ax.w")
    public String field424;

    @ObfuscatedName("ax.e")
    public String field420;

    @ObfuscatedName("ax.k")
    public int field421 = -1;

    @ObfuscatedName("ax.u")
    public int field422 = -1;

    @ObfuscatedName("ax.z")
    public class224 field423 = null;

    @ObfuscatedName("ax.t")
    public int field425 = Integer.MAX_VALUE;

    @ObfuscatedName("ax.f")
    public int field418 = 0;

    @ObfuscatedName("ax.g")
    public int field426 = Integer.MAX_VALUE;

    @ObfuscatedName("ax.j")
    public int field432 = 0;

    @ObfuscatedName("ax.x")
    public boolean field427 = false;

    @ObfuscatedName("ax.c")
    public LinkedList field429;

    @ObfuscatedName("ax.a(Lgh;II)V")
    public void method280(class185 arg0, int arg1) {
        this.field428 = arg1;
        this.field424 = arg0.method3168();
        this.field420 = arg0.method3168();
        this.field423 = new class224(arg0.method2967());
        this.field421 = arg0.method2967();
        arg0.method2962();
        this.field427 = arg0.method2962() == 1;
        this.field422 = arg0.method2962();
        int var3 = arg0.method2962();
        this.field429 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field429.add(this.method240(arg0));
        }
        this.method241();
    }

    @ObfuscatedName("ax.w(Lgh;I)Lah;")
    public class43 method240(class185 arg0) {
        int var2 = arg0.method2962();
        class28[] var3 = new class28[] { class28.field368, class28.field367, class28.field370, class28.field369 };
        class28 var4 = (class28) class180.method1581(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field371) {
            case 0:
                var6 = new class27();
                break;
            case 1:
                var6 = new class49();
                break;
            case 2:
                var6 = new class39();
                break;
            case 3:
                var6 = new class31();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var6).method194(arg0);
        return (class43) var6;
    }

    @ObfuscatedName("ax.e(IIII)Z")
    public boolean method237(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field429.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method175(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ax.k(IIB)Z")
    public boolean method238(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field425 || var3 > this.field418) {
            return false;
        } else if (var4 >= this.field426 && var4 <= this.field432) {
            Iterator var5 = this.field429.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method176(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ax.u(IIII)[I")
    public int[] method239(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field429.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method175(arg0, arg1, arg2));
        return var5.method177(arg0, arg1, arg2);
    }

    @ObfuscatedName("ax.z(III)Lhc;")
    public class224 method253(int arg0, int arg1) {
        Iterator var3 = this.field429.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method176(arg0, arg1));
        return var4.method178(arg0, arg1);
    }

    @ObfuscatedName("ax.t(B)V")
    public void method241() {
        Iterator var1 = this.field429.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method174(this);
        }
    }

    @ObfuscatedName("ax.f(B)I")
    public int method246() {
        return this.field428;
    }

    @ObfuscatedName("ax.g(B)Z")
    public boolean method301() {
        return this.field427;
    }

    @ObfuscatedName("ax.x(I)Ljava/lang/String;")
    public String method294() {
        return this.field424;
    }

    @ObfuscatedName("ax.c(I)Ljava/lang/String;")
    public String method243() {
        return this.field420;
    }

    @ObfuscatedName("ax.n(S)I")
    public int method234() {
        return this.field421;
    }

    @ObfuscatedName("ax.y(I)I")
    public int method247() {
        return this.field422;
    }

    @ObfuscatedName("ax.o(I)I")
    public int method304() {
        return this.field425;
    }

    @ObfuscatedName("ax.r(I)I")
    public int method249() {
        return this.field418;
    }

    @ObfuscatedName("ax.i(I)I")
    public int method250() {
        return this.field426;
    }

    @ObfuscatedName("ax.q(I)I")
    public int method251() {
        return this.field432;
    }

    @ObfuscatedName("ax.b(I)I")
    public int method252() {
        return this.field423.field2725;
    }

    @ObfuscatedName("ax.h(B)I")
    public int method299() {
        return this.field423.field2728;
    }

    @ObfuscatedName("ax.d(B)I")
    public int method258() {
        return this.field423.field2726;
    }

    @ObfuscatedName("ax.v(I)Lhc;")
    public class224 method255() {
        return new class224(this.field423);
    }
}
