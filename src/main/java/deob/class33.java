package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("as")
public class class33 {

    @ObfuscatedName("as.s")
    public int field429 = -1;

    @ObfuscatedName("as.g")
    public String field431;

    @ObfuscatedName("as.m")
    public String field428;

    @ObfuscatedName("as.h")
    public int field430 = -1;

    @ObfuscatedName("as.i")
    public int field441 = -1;

    @ObfuscatedName("as.w")
    public class224 field432 = null;

    @ObfuscatedName("as.t")
    public int field433 = Integer.MAX_VALUE;

    @ObfuscatedName("as.d")
    public int field434 = 0;

    @ObfuscatedName("as.z")
    public int field427 = Integer.MAX_VALUE;

    @ObfuscatedName("as.k")
    public int field436 = 0;

    @ObfuscatedName("as.c")
    public boolean field437 = false;

    @ObfuscatedName("as.o")
    public LinkedList field438;

    @ObfuscatedName("as.s(Lgy;II)V")
    public void method257(class185 arg0, int arg1) {
        this.field429 = arg1;
        this.field431 = arg0.method3248();
        this.field428 = arg0.method3248();
        this.field432 = new class224(arg0.method3292());
        this.field430 = arg0.method3292();
        arg0.method3239();
        this.field437 = arg0.method3239() == 1;
        this.field441 = arg0.method3239();
        int var3 = arg0.method3239();
        this.field438 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field438.add(this.method245(arg0));
        }
        this.method250();
    }

    @ObfuscatedName("as.g(Lgy;I)Lae;")
    public class43 method245(class185 arg0) {
        int var2 = arg0.method3239();
        class28[] var3 = new class28[] { class28.field384, class28.field385, class28.field375, class28.field387 };
        class28 var4 = (class28) class180.method1823(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field378) {
            case 0:
                var6 = new class49();
                break;
            case 1:
                var6 = new class27();
                break;
            case 2:
                var6 = new class31();
                break;
            case 3:
                var6 = new class39();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var6).method186(arg0);
        return (class43) var6;
    }

    @ObfuscatedName("as.m(IIII)Z")
    public boolean method306(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field438.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method182(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("as.h(III)Z")
    public boolean method307(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field433 || var3 > this.field434) {
            return false;
        } else if (var4 >= this.field427 && var4 <= this.field436) {
            Iterator var5 = this.field438.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method183(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("as.i(IIII)[I")
    public int[] method303(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field438.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method182(arg0, arg1, arg2));
        return var5.method187(arg0, arg1, arg2);
    }

    @ObfuscatedName("as.w(III)Lhv;")
    public class224 method258(int arg0, int arg1) {
        Iterator var3 = this.field438.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method183(arg0, arg1));
        return var4.method185(arg0, arg1);
    }

    @ObfuscatedName("as.t(I)V")
    public void method250() {
        Iterator var1 = this.field438.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method181(this);
        }
    }

    @ObfuscatedName("as.d(I)I")
    public int method251() {
        return this.field429;
    }

    @ObfuscatedName("as.z(B)Z")
    public boolean method252() {
        return this.field437;
    }

    @ObfuscatedName("as.k(I)Ljava/lang/String;")
    public String method247() {
        return this.field431;
    }

    @ObfuscatedName("as.c(I)Ljava/lang/String;")
    public String method253() {
        return this.field428;
    }

    @ObfuscatedName("as.o(S)I")
    public int method244() {
        return this.field430;
    }

    @ObfuscatedName("as.l(B)I")
    public int method283() {
        return this.field441;
    }

    @ObfuscatedName("as.f(I)I")
    public int method256() {
        return this.field433;
    }

    @ObfuscatedName("as.q(I)I")
    public int method292() {
        return this.field434;
    }

    @ObfuscatedName("as.r(B)I")
    public int method277() {
        return this.field427;
    }

    @ObfuscatedName("as.x(I)I")
    public int method259() {
        return this.field436;
    }

    @ObfuscatedName("as.u(I)I")
    public int method280() {
        return this.field432.field2718;
    }

    @ObfuscatedName("as.a(I)I")
    public int method248() {
        return this.field432.field2717;
    }

    @ObfuscatedName("as.ad(B)I")
    public int method287() {
        return this.field432.field2716;
    }

    @ObfuscatedName("as.al(I)Lhv;")
    public class224 method263() {
        return new class224(this.field432);
    }
}
