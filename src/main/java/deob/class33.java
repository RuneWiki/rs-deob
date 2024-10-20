package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("am")
public class class33 {

    @ObfuscatedName("am.a")
    public int field447 = -1;

    @ObfuscatedName("am.j")
    public String field443;

    @ObfuscatedName("am.n")
    public String field444;

    @ObfuscatedName("am.r")
    public int field453 = -1;

    @ObfuscatedName("am.v")
    public int field446 = -1;

    @ObfuscatedName("am.e")
    public class213 field445 = null;

    @ObfuscatedName("am.l")
    public int field448 = Integer.MAX_VALUE;

    @ObfuscatedName("am.s")
    public int field449 = 0;

    @ObfuscatedName("am.w")
    public int field442 = Integer.MAX_VALUE;

    @ObfuscatedName("am.p")
    public int field451 = 0;

    @ObfuscatedName("am.m")
    public boolean field452 = false;

    @ObfuscatedName("am.u")
    public LinkedList field450;

    @ObfuscatedName("am.a(Lfe;II)V")
    public void method242(class174 arg0, int arg1) {
        this.field447 = arg1;
        this.field443 = arg0.method2879();
        this.field444 = arg0.method2879();
        this.field445 = new class213(arg0.method2876());
        this.field453 = arg0.method2876();
        arg0.method2871();
        this.field452 = arg0.method2871() == 1;
        this.field446 = arg0.method2871();
        int var3 = arg0.method2871();
        this.field450 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field450.add(this.method279(arg0));
        }
        this.method248();
    }

    @ObfuscatedName("am.j(Lfe;B)Lav;")
    public class43 method279(class174 arg0) {
        int var2 = arg0.method2871();
        class28 var3 = (class28) class169.method1334(class28.method201(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field393) {
            case 0:
                var5 = new class31();
                break;
            case 1:
                var5 = new class27();
                break;
            case 2:
                var5 = new class49();
                break;
            case 3:
                var5 = new class39();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var5).method182(arg0);
        return (class43) var5;
    }

    @ObfuscatedName("am.n(IIII)Z")
    public boolean method244(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field450.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method187(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("am.r(III)Z")
    public boolean method245(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field448 || var3 > this.field449) {
            return false;
        } else if (var4 >= this.field442 && var4 <= this.field451) {
            Iterator var5 = this.field450.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method197(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("am.v(IIII)[I")
    public int[] method295(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field450.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method187(arg0, arg1, arg2));
        return var5.method173(arg0, arg1, arg2);
    }

    @ObfuscatedName("am.e(IIB)Lhd;")
    public class213 method247(int arg0, int arg1) {
        Iterator var3 = this.field450.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method197(arg0, arg1));
        return var4.method174(arg0, arg1);
    }

    @ObfuscatedName("am.l(I)V")
    public void method248() {
        Iterator var1 = this.field450.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method170(this);
        }
    }

    @ObfuscatedName("am.s(B)I")
    public int method260() {
        return this.field447;
    }

    @ObfuscatedName("am.w(I)Z")
    public boolean method250() {
        return this.field452;
    }

    @ObfuscatedName("am.p(I)Ljava/lang/String;")
    public String method251() {
        return this.field443;
    }

    @ObfuscatedName("am.m(I)Ljava/lang/String;")
    public String method265() {
        return this.field444;
    }

    @ObfuscatedName("am.u(B)I")
    public int method299() {
        return this.field453;
    }

    @ObfuscatedName("am.g(B)I")
    public int method246() {
        return this.field446;
    }

    @ObfuscatedName("am.k(B)I")
    public int method255() {
        return this.field448;
    }

    @ObfuscatedName("am.c(I)I")
    public int method241() {
        return this.field449;
    }

    @ObfuscatedName("am.o(I)I")
    public int method256() {
        return this.field442;
    }

    @ObfuscatedName("am.x(I)I")
    public int method243() {
        return this.field451;
    }

    @ObfuscatedName("am.h(I)I")
    public int method259() {
        return this.field445.field2615;
    }

    @ObfuscatedName("am.z(I)I")
    public int method306() {
        return this.field445.field2616;
    }

    @ObfuscatedName("am.i(I)I")
    public int method261() {
        return this.field445.field2618;
    }

    @ObfuscatedName("am.d(B)Lhd;")
    public class213 method262() {
        return new class213(this.field445);
    }
}
