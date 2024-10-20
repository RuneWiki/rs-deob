package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ap")
public class class33 {

    @ObfuscatedName("ap.m")
    public int field438 = -1;

    @ObfuscatedName("ap.p")
    public String field432;

    @ObfuscatedName("ap.i")
    public String field444;

    @ObfuscatedName("ap.j")
    public int field434 = -1;

    @ObfuscatedName("ap.v")
    public int field437 = -1;

    @ObfuscatedName("ap.x")
    public class220 field436 = null;

    @ObfuscatedName("ap.e")
    public int field431 = Integer.MAX_VALUE;

    @ObfuscatedName("ap.l")
    public int field433 = 0;

    @ObfuscatedName("ap.b")
    public int field439 = Integer.MAX_VALUE;

    @ObfuscatedName("ap.n")
    public int field440 = 0;

    @ObfuscatedName("ap.c")
    public boolean field435 = false;

    @ObfuscatedName("ap.a")
    public LinkedList field441;

    @ObfuscatedName("ap.m(Lfv;II)V")
    public void method331(class181 arg0, int arg1) {
        this.field438 = arg1;
        this.field432 = arg0.method3021();
        this.field444 = arg0.method3021();
        this.field436 = new class220(arg0.method3017());
        this.field434 = arg0.method3017();
        arg0.method3012();
        this.field435 = arg0.method3012() == 1;
        this.field437 = arg0.method3012();
        int var3 = arg0.method3012();
        this.field441 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field441.add(this.method299(arg0));
        }
        this.method297();
    }

    @ObfuscatedName("ap.p(Lfv;I)Lau;")
    public class43 method299(class181 arg0) {
        int var2 = arg0.method3012();
        class28[] var3 = new class28[] { class28.field391, class28.field380, class28.field379, class28.field378 };
        class28 var4 = (class28) class176.method676(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field389) {
            case 0:
                var6 = new class49();
                break;
            case 1:
                var6 = new class39();
                break;
            case 2:
                var6 = new class27();
                break;
            case 3:
                var6 = new class31();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var6).method199(arg0);
        return (class43) var6;
    }

    @ObfuscatedName("ap.i(IIII)Z")
    public boolean method303(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field441.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method193(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ap.j(III)Z")
    public boolean method272(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field431 || var3 > this.field433) {
            return false;
        } else if (var4 >= this.field439 && var4 <= this.field440) {
            Iterator var5 = this.field441.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method196(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ap.v(IIIB)[I")
    public int[] method273(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field441.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method193(arg0, arg1, arg2));
        return var5.method197(arg0, arg1, arg2);
    }

    @ObfuscatedName("ap.x(III)Lhq;")
    public class220 method286(int arg0, int arg1) {
        Iterator var3 = this.field441.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method196(arg0, arg1));
        return var4.method198(arg0, arg1);
    }

    @ObfuscatedName("ap.e(I)V")
    public void method297() {
        Iterator var1 = this.field441.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method194(this);
        }
    }

    @ObfuscatedName("ap.l(I)I")
    public int method351() {
        return this.field438;
    }

    @ObfuscatedName("ap.b(I)Z")
    public boolean method275() {
        return this.field435;
    }

    @ObfuscatedName("ap.n(B)Ljava/lang/String;")
    public String method278() {
        return this.field432;
    }

    @ObfuscatedName("ap.c(I)Ljava/lang/String;")
    public String method269() {
        return this.field444;
    }

    @ObfuscatedName("ap.a(I)I")
    public int method280() {
        return this.field434;
    }

    @ObfuscatedName("ap.y(B)I")
    public int method281() {
        return this.field437;
    }

    @ObfuscatedName("ap.w(I)I")
    public int method282() {
        return this.field431;
    }

    @ObfuscatedName("ap.k(I)I")
    public int method283() {
        return this.field433;
    }

    @ObfuscatedName("ap.t(I)I")
    public int method284() {
        return this.field439;
    }

    @ObfuscatedName("ap.h(B)I")
    public int method285() {
        return this.field440;
    }

    @ObfuscatedName("ap.u(I)I")
    public int method287() {
        return this.field436.field2692;
    }

    @ObfuscatedName("ap.r(S)I")
    public int method276() {
        return this.field436.field2695;
    }

    @ObfuscatedName("ap.o(B)I")
    public int method288() {
        return this.field436.field2691;
    }

    @ObfuscatedName("ap.q(I)Lhq;")
    public class220 method270() {
        return new class220(this.field436);
    }
}
