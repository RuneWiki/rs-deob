package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("am")
public class class33 {

    @ObfuscatedName("am.b")
    public int field426 = -1;

    @ObfuscatedName("am.s")
    public String field432;

    @ObfuscatedName("am.r")
    public String field420;

    @ObfuscatedName("am.g")
    public int field431 = -1;

    @ObfuscatedName("am.x")
    public int field422 = -1;

    @ObfuscatedName("am.f")
    public class220 field423 = null;

    @ObfuscatedName("am.u")
    public int field424 = Integer.MAX_VALUE;

    @ObfuscatedName("am.t")
    public int field425 = 0;

    @ObfuscatedName("am.k")
    public int field418 = Integer.MAX_VALUE;

    @ObfuscatedName("am.n")
    public int field427 = 0;

    @ObfuscatedName("am.d")
    public boolean field428 = false;

    @ObfuscatedName("am.o")
    public LinkedList field429;

    @ObfuscatedName("am.b(Lfs;II)V")
    public void method242(class181 arg0, int arg1) {
        this.field426 = arg1;
        this.field432 = arg0.method2953();
        this.field420 = arg0.method2953();
        this.field423 = new class220(arg0.method2996());
        this.field431 = arg0.method2996();
        arg0.method2945();
        this.field428 = arg0.method2945() == 1;
        this.field422 = arg0.method2945();
        int var3 = arg0.method2945();
        this.field429 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field429.add(this.method236(arg0));
        }
        this.method272();
    }

    @ObfuscatedName("am.s(Lfs;I)Lap;")
    public class43 method236(class181 arg0) {
        int var2 = arg0.method2945();
        class28[] var3 = new class28[] { class28.field363, class28.field366, class28.field372, class28.field365 };
        class28 var4 = (class28) class176.method2719(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field367) {
            case 0:
                var6 = new class31();
                break;
            case 1:
                var6 = new class27();
                break;
            case 2:
                var6 = new class39();
                break;
            case 3:
                var6 = new class49();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var6).method176(arg0);
        return (class43) var6;
    }

    @ObfuscatedName("am.r(IIII)Z")
    public boolean method245(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field429.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method172(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("am.g(III)Z")
    public boolean method223(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field424 || var3 > this.field425) {
            return false;
        } else if (var4 >= this.field418 && var4 <= this.field427) {
            Iterator var5 = this.field429.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method173(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("am.x(IIII)[I")
    public int[] method224(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field429.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method172(arg0, arg1, arg2));
        return var5.method174(arg0, arg1, arg2);
    }

    @ObfuscatedName("am.f(IIB)Lhk;")
    public class220 method225(int arg0, int arg1) {
        Iterator var3 = this.field429.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method173(arg0, arg1));
        return var4.method175(arg0, arg1);
    }

    @ObfuscatedName("am.u(B)V")
    public void method272() {
        Iterator var1 = this.field429.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method184(this);
        }
    }

    @ObfuscatedName("am.t(I)I")
    public int method227() {
        return this.field426;
    }

    @ObfuscatedName("am.k(I)Z")
    public boolean method228() {
        return this.field428;
    }

    @ObfuscatedName("am.n(I)Ljava/lang/String;")
    public String method229() {
        return this.field432;
    }

    @ObfuscatedName("am.d(I)Ljava/lang/String;")
    public String method230() {
        return this.field420;
    }

    @ObfuscatedName("am.o(I)I")
    public int method222() {
        return this.field431;
    }

    @ObfuscatedName("am.a(I)I")
    public int method234() {
        return this.field422;
    }

    @ObfuscatedName("am.q(I)I")
    public int method226() {
        return this.field424;
    }

    @ObfuscatedName("am.j(I)I")
    public int method283() {
        return this.field425;
    }

    @ObfuscatedName("am.c(I)I")
    public int method235() {
        return this.field418;
    }

    @ObfuscatedName("am.i(B)I")
    public int method281() {
        return this.field427;
    }

    @ObfuscatedName("am.l(I)I")
    public int method248() {
        return this.field423.field2683;
    }

    @ObfuscatedName("am.z(I)I")
    public int method238() {
        return this.field423.field2682;
    }

    @ObfuscatedName("am.e(I)I")
    public int method239() {
        return this.field423.field2684;
    }

    @ObfuscatedName("am.v(I)Lhk;")
    public class220 method240() {
        return new class220(this.field423);
    }
}
