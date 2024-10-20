package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ir")
public class class246 extends class225 {

    @ObfuscatedName("ir.m")
    public HashSet field2881;

    @ObfuscatedName("ir.u")
    public HashSet field2877;

    @ObfuscatedName("ir.l")
    public List field2878;

    @ObfuscatedName("ir.bf(Lqr;Lqr;IZI)V")
    public void method4506(class444 arg0, class444 arg1, int arg2, boolean arg3) {
        this.method4151(arg0, arg2);
        int var5 = arg1.method7120();
        this.field2881 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class220 var7 = new class220();
            try {
                var7.method4081(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2881.add(var7);
        }
        int var9 = arg1.method7120();
        this.field2877 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class228 var11 = new class228();
            try {
                var11.method4395(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2877.add(var11);
        }
        this.method4507(arg1, arg3);
    }

    @ObfuscatedName("ir.ce(Lqr;ZB)V")
    public void method4507(class444 arg0, boolean arg1) {
        this.field2878 = new LinkedList();
        int var3 = arg0.method7120();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method6945();
            class290 var6 = new class290(arg0.method6934());
            boolean var7 = arg0.method6929() == 1;
            if (arg1 || !var7) {
                this.field2878.add(new class231((class290) null, var6, var5, (class238) null));
            }
        }
    }
}
