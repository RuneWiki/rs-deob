package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("az")
public class class33 {

    @ObfuscatedName("az.n")
    public int field433 = -1;

    @ObfuscatedName("az.v")
    public String field428;

    @ObfuscatedName("az.y")
    public String field429;

    @ObfuscatedName("az.r")
    public int field427 = -1;

    @ObfuscatedName("az.h")
    public int field431 = -1;

    @ObfuscatedName("az.d")
    public class224 field432 = null;

    @ObfuscatedName("az.s")
    public int field438 = Integer.MAX_VALUE;

    @ObfuscatedName("az.b")
    public int field435 = 0;

    @ObfuscatedName("az.e")
    public int field437 = Integer.MAX_VALUE;

    @ObfuscatedName("az.f")
    public int field441 = 0;

    @ObfuscatedName("az.z")
    public boolean field443 = false;

    @ObfuscatedName("az.u")
    public LinkedList field434;

    @ObfuscatedName("az.n(Lgv;II)V")
    public void method304(class185 arg0, int arg1) {
        this.field433 = arg1;
        this.field428 = arg0.method3030();
        this.field429 = arg0.method3030();
        this.field432 = new class224(arg0.method3026());
        this.field427 = arg0.method3026();
        arg0.method3021();
        this.field443 = arg0.method3021() == 1;
        this.field431 = arg0.method3021();
        int var3 = arg0.method3021();
        this.field434 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field434.add(this.method244(arg0));
        }
        this.method249();
    }

    @ObfuscatedName("az.v(Lgv;I)Lal;")
    public class43 method244(class185 arg0) {
        int var2 = arg0.method3021();
        class28 var3 = (class28) class180.method455(class28.method196(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field388) {
            case 0:
                var5 = new class39();
                break;
            case 1:
                var5 = new class31();
                break;
            case 2:
                var5 = new class49();
                break;
            case 3:
                var5 = new class27();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var5).method175(arg0);
        return (class43) var5;
    }

    @ObfuscatedName("az.y(IIII)Z")
    public boolean method245(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field434.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method171(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("az.r(III)Z")
    public boolean method265(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field438 || var3 > this.field435) {
            return false;
        } else if (var4 >= this.field437 && var4 <= this.field441) {
            Iterator var5 = this.field434.iterator();
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

    @ObfuscatedName("az.h(IIII)[I")
    public int[] method291(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field434.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method171(arg0, arg1, arg2));
        return var5.method194(arg0, arg1, arg2);
    }

    @ObfuscatedName("az.d(III)Lht;")
    public class224 method248(int arg0, int arg1) {
        Iterator var3 = this.field434.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method183(arg0, arg1));
        return var4.method174(arg0, arg1);
    }

    @ObfuscatedName("az.s(I)V")
    public void method249() {
        Iterator var1 = this.field434.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method170(this);
        }
    }

    @ObfuscatedName("az.b(S)I")
    public int method250() {
        return this.field433;
    }

    @ObfuscatedName("az.e(I)Z")
    public boolean method302() {
        return this.field443;
    }

    @ObfuscatedName("az.f(I)Ljava/lang/String;")
    public String method247() {
        return this.field428;
    }

    @ObfuscatedName("az.u(I)Ljava/lang/String;")
    public String method253() {
        return this.field429;
    }

    @ObfuscatedName("az.t(I)I")
    public int method289() {
        return this.field427;
    }

    @ObfuscatedName("az.o(B)I")
    public int method257() {
        return this.field431;
    }

    @ObfuscatedName("az.a(I)I")
    public int method266() {
        return this.field438;
    }

    @ObfuscatedName("az.i(B)I")
    public int method295() {
        return this.field435;
    }

    @ObfuscatedName("az.m(I)I")
    public int method258() {
        return this.field437;
    }

    @ObfuscatedName("az.x(I)I")
    public int method259() {
        return this.field441;
    }

    @ObfuscatedName("az.j(I)I")
    public int method243() {
        return this.field432.field2730;
    }

    @ObfuscatedName("az.g(I)I")
    public int method261() {
        return this.field432.field2729;
    }

    @ObfuscatedName("az.c(I)I")
    public int method262() {
        return this.field432.field2731;
    }

    @ObfuscatedName("az.k(B)Lht;")
    public class224 method263() {
        return new class224(this.field432);
    }
}
