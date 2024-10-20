package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("au")
public class class48 extends class36 {

    @ObfuscatedName("au.a")
    public HashSet field362;

    @ObfuscatedName("au.w")
    public HashSet field361;

    @ObfuscatedName("au.k")
    public List field364;

    @ObfuscatedName("au.cn(Lkx;Lkx;IZI)V")
    public void method662(class311 arg0, class311 arg1, int arg2, boolean arg3) {
        this.method346(arg0, arg2);
        int var5 = arg1.method5247();
        this.field362 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class25 var7 = new class25();
            try {
                var7.method217(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field362.add(var7);
        }
        int var9 = arg1.method5247();
        this.field361 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class49 var11 = new class49();
            try {
                var11.method669(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field361.add(var11);
        }
        this.method661(arg1, arg3);
    }

    @ObfuscatedName("au.cj(Lkx;ZI)V")
    public void method661(class311 arg0, boolean arg1) {
        this.field364 = new LinkedList();
        int var3 = arg0.method5247();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5389();
            class223 var6 = new class223(arg0.method5455());
            boolean var7 = arg0.method5310() == 1;
            if (arg1 || !var7) {
                this.field364.add(new class28((class223) null, var6, var5, (class38) null));
            }
        }
    }
}
