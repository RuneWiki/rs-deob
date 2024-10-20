package org.bouncycastle.math.raw;

public abstract class Nat512 {

    public static void square(int[] arg0, int[] arg1) {
        Nat256.square(arg0, arg1);
        Nat256.square(arg0, 8, arg1, 16);
        int var2 = Nat256.addToEachOther(arg1, 8, arg1, 16);
        int var3 = var2 + Nat256.addTo(arg1, 0, arg1, 8, 0);
        int var4 = var2 + Nat256.addTo(arg1, 24, arg1, 16, var3);
        int[] var5 = Nat256.create();
        Nat256.diff(arg0, 8, arg0, 0, var5, 0);
        int[] var6 = Nat256.createExt();
        Nat256.square(var5, var6);
        int var7 = var4 + Nat.subFrom(16, var6, 0, arg1, 8);
        Nat.addWordAt(32, var7, arg1, 24);
    }

    public static void mul(int[] arg0, int[] arg1, int[] arg2) {
        Nat256.mul(arg0, arg1, arg2);
        Nat256.mul(arg0, 8, arg1, 8, arg2, 16);
        int var3 = Nat256.addToEachOther(arg2, 8, arg2, 16);
        int var4 = var3 + Nat256.addTo(arg2, 0, arg2, 8, 0);
        int var5 = var3 + Nat256.addTo(arg2, 24, arg2, 16, var4);
        int[] var6 = Nat256.create();
        int[] var7 = Nat256.create();
        boolean var8 = Nat256.diff(arg0, 8, arg0, 0, var6, 0) != Nat256.diff(arg1, 8, arg1, 0, var7, 0);
        int[] var9 = Nat256.createExt();
        Nat256.mul(var6, var7, var9);
        int var10 = var5 + (var8 ? Nat.addTo(16, var9, 0, arg2, 8) : Nat.subFrom(16, var9, 0, arg2, 8));
        Nat.addWordAt(32, var10, arg2, 24);
    }
}
