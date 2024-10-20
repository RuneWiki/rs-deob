package deob;

@ObfuscatedName("mf")
public class class324 extends class506 {

    @ObfuscatedName("mf.ab")
    public class322 field3375;

    @ObfuscatedName("mf.ay")
    public int field3378;

    @ObfuscatedName("mf.an")
    public class548 field3379;

    @ObfuscatedName("mf.au")
    public int field3377;

    @ObfuscatedName("mf.ax")
    public static class324[] field3374 = new class324[300];

    @ObfuscatedName("mf.ao")
    public static int field3376 = 0;

    @ObfuscatedName("dc.ab(I)Lmf;")
    public static class324 method2337() {
        return field3376 == 0 ? new class324() : field3374[--field3376];
    }

    @ObfuscatedName("ix.ay(Lmc;Lvu;B)Lmf;")
    public static class324 method4244(class322 arg0, class566 arg1) {
        class324 var2 = method2337();
        var2.field3375 = arg0;
        var2.field3378 = arg0.field3259;
        if (var2.field3378 == -1) {
            var2.field3379 = new class548(260);
        } else if (var2.field3378 == -2) {
            var2.field3379 = new class548(10000);
        } else if (var2.field3378 <= 18) {
            var2.field3379 = new class548(20);
        } else if (var2.field3378 <= 98) {
            var2.field3379 = new class548(100);
        } else {
            var2.field3379 = new class548(260);
        }
        var2.field3379.method8740(arg1);
        var2.field3379.method8741(var2.field3375.field3358);
        var2.field3377 = 0;
        return var2;
    }

    @ObfuscatedName("mf.an(I)V")
    public void method5609() {
        if (field3376 < field3374.length) {
            field3374[++field3376 - 1] = this;
        }
    }
}
