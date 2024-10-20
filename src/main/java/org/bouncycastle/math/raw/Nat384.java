package org.bouncycastle.math.raw;

public abstract class Nat384 {

    public static void mul(int[] arg0, int[] arg1, int[] arg2) {
        Nat192.mul(arg0, arg1, arg2);
        Nat192.mul(arg0, 6, arg1, 6, arg2, 12);
        int var3 = Nat192.addToEachOther(arg2, 6, arg2, 12);
        int var4 = var3 + Nat192.addTo(arg2, 0, arg2, 6, 0);
        int var5 = var3 + Nat192.addTo(arg2, 18, arg2, 12, var4);
        int[] var6 = Nat192.create();
        int[] var7 = Nat192.create();
        boolean var8 = Nat192.diff(arg0, 6, arg0, 0, var6, 0) != Nat192.diff(arg1, 6, arg1, 0, var7, 0);
        int[] var9 = Nat192.createExt();
        Nat192.mul(var6, var7, var9);
        int var10 = var5 + (var8 ? Nat.addTo(12, var9, 0, arg2, 6) : Nat.subFrom(12, var9, 0, arg2, 6));
        Nat.addWordAt(24, var10, arg2, 18);
    }

    public static void square(int[] arg0, int[] arg1) {
        Nat192.square(arg0, arg1);
        Nat192.square(arg0, 6, arg1, 12);
        int var2 = Nat192.addToEachOther(arg1, 6, arg1, 12);
        int var3 = var2 + Nat192.addTo(arg1, 0, arg1, 6, 0);
        int var4 = var2 + Nat192.addTo(arg1, 18, arg1, 12, var3);
        int[] var5 = Nat192.create();
        Nat192.diff(arg0, 6, arg0, 0, var5, 0);
        int[] var6 = Nat192.createExt();
        Nat192.square(var5, var6);
        int var7 = var4 + Nat.subFrom(12, var6, 0, arg1, 6);
        Nat.addWordAt(24, var7, arg1, 18);
    }
}
