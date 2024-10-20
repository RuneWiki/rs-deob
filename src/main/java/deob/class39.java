package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ao")
public class class39 extends class27 {

    @ObfuscatedName("ao.i")
    public HashSet field324;

    @ObfuscatedName("ao.m")
    public HashSet field322;

    @ObfuscatedName("ao.v")
    public List field323;

    @ObfuscatedName("ao.by(Lgc;Lgc;IZB)V")
    public void method555(class190 arg0, class190 arg1, int arg2, boolean arg3) {
        this.method317(arg0, arg2);
        int var5 = arg1.method3513();
        this.field324 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class16 var7 = new class16();
            try {
                var7.method169(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field324.add(var7);
        }
        int var9 = arg1.method3513();
        this.field322 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class40 var11 = new class40();
            try {
                var11.method569(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field322.add(var11);
        }
        this.method556(arg1, arg3);
    }

    @ObfuscatedName("ao.bg(Lgc;ZI)V")
    public void method556(class190 arg0, boolean arg1) {
        this.field323 = new LinkedList();
        int var3 = arg0.method3513();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3516();
            class234 var6 = new class234(arg0.method3562());
            boolean var7 = arg0.method3511() == 1;
            if (arg1 || !var7) {
                this.field323.add(new class19((class234) null, var6, var5, (class29) null));
            }
        }
    }
}
