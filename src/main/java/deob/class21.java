package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("a")
public class class21 {

    @ObfuscatedName("a.z")
    public int field171 = -1;

    @ObfuscatedName("a.w")
    public String field162;

    @ObfuscatedName("a.s")
    public String field172;

    @ObfuscatedName("a.l")
    public int field164 = -1;

    @ObfuscatedName("a.u")
    public int field165 = -1;

    @ObfuscatedName("a.q")
    public class227 field166 = null;

    @ObfuscatedName("a.k")
    public int field167 = Integer.MAX_VALUE;

    @ObfuscatedName("a.i")
    public int field168 = 0;

    @ObfuscatedName("a.x")
    public int field169 = Integer.MAX_VALUE;

    @ObfuscatedName("a.e")
    public int field163 = 0;

    @ObfuscatedName("a.p")
    public boolean field174 = false;

    @ObfuscatedName("a.b")
    public LinkedList field161;

    @ObfuscatedName("a.z(Lgk;II)V")
    public void method181(class183 arg0, int arg1) {
        this.field171 = arg1;
        this.field162 = arg0.method3441();
        this.field172 = arg0.method3441();
        this.field166 = new class227(arg0.method3374());
        this.field164 = arg0.method3374();
        arg0.method3247();
        this.field174 = arg0.method3247() == 1;
        this.field165 = arg0.method3247();
        int var3 = arg0.method3247();
        this.field161 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field161.add(this.method182(arg0));
        }
        this.method187();
    }

    @ObfuscatedName("a.w(Lgk;I)Las;")
    public class32 method182(class183 arg0) {
        int var2 = arg0.method3247();
        class16 var3 = (class16) class178.method1685(class16.method146(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field111) {
            case 0:
                var5 = new class15();
                break;
            case 1:
                var5 = new class38();
                break;
            case 2:
                var5 = new class19();
                break;
            case 3:
                var5 = new class28();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class32) var5).method121(arg0);
        return (class32) var5;
    }

    @ObfuscatedName("a.s(IIIB)Z")
    public boolean method183(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field161.iterator();
        class32 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class32) var4.next();
        } while (!var5.method117(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("a.l(III)Z")
    public boolean method184(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field167 || var3 > this.field168) {
            return false;
        } else if (var4 >= this.field169 && var4 <= this.field163) {
            Iterator var5 = this.field161.iterator();
            class32 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class32) var5.next();
            } while (!var6.method118(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("a.u(IIIB)[I")
    public int[] method194(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field161.iterator();
        class32 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class32) var4.next();
        } while (!var5.method117(arg0, arg1, arg2));
        return var5.method119(arg0, arg1, arg2);
    }

    @ObfuscatedName("a.q(III)Lha;")
    public class227 method186(int arg0, int arg1) {
        Iterator var3 = this.field161.iterator();
        class32 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class32) var3.next();
        } while (!var4.method118(arg0, arg1));
        return var4.method120(arg0, arg1);
    }

    @ObfuscatedName("a.i(I)V")
    public void method187() {
        Iterator var1 = this.field161.iterator();
        while (var1.hasNext()) {
            class32 var2 = (class32) var1.next();
            var2.method116(this);
        }
    }

    @ObfuscatedName("a.x(B)I")
    public int method188() {
        return this.field171;
    }

    @ObfuscatedName("a.e(B)Z")
    public boolean method189() {
        return this.field174;
    }

    @ObfuscatedName("a.p(I)Ljava/lang/String;")
    public String method190() {
        return this.field162;
    }

    @ObfuscatedName("a.b(I)Ljava/lang/String;")
    public String method191() {
        return this.field172;
    }

    @ObfuscatedName("a.n(B)I")
    public int method192() {
        return this.field164;
    }

    @ObfuscatedName("a.f(B)I")
    public int method193() {
        return this.field165;
    }

    @ObfuscatedName("a.g(I)I")
    public int method239() {
        return this.field167;
    }

    @ObfuscatedName("a.m(I)I")
    public int method195() {
        return this.field168;
    }

    @ObfuscatedName("a.r(I)I")
    public int method228() {
        return this.field169;
    }

    @ObfuscatedName("a.t(I)I")
    public int method230() {
        return this.field163;
    }

    @ObfuscatedName("a.o(I)I")
    public int method198() {
        return this.field166.field2565;
    }

    @ObfuscatedName("a.y(I)I")
    public int method199() {
        return this.field166.field2568;
    }

    @ObfuscatedName("a.a(B)I")
    public int method200() {
        return this.field166.field2566;
    }

    @ObfuscatedName("a.c(I)Lha;")
    public class227 method237() {
        return new class227(this.field166);
    }
}
