package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kv")
public class class278 extends class257 {

    @ObfuscatedName("kv.al")
    public HashSet field3071;

    @ObfuscatedName("kv.an")
    public HashSet field3072;

    @ObfuscatedName("kv.ar")
    public List field3073;

    @ObfuscatedName("kv.cu(Ltm;Ltm;IZI)V")
    public void method5093(class515 arg0, class515 arg1, int arg2, boolean arg3) {
        this.method4731(arg0, arg2);
        int var5 = arg1.method8448();
        this.field3071 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class252 var7 = new class252();
            try {
                var7.method4677(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field3071.add(var7);
        }
        int var9 = arg1.method8448();
        this.field3072 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class260 var11 = new class260();
            try {
                var11.method4965(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field3072.add(var11);
        }
        this.method5088(arg1, arg3);
    }

    @ObfuscatedName("kv.ch(Ltm;ZB)V")
    public void method5088(class515 arg0, boolean arg1) {
        this.field3073 = new LinkedList();
        int var3 = arg0.method8448();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method8440();
            class323 var6 = new class323(arg0.method8306());
            boolean var7 = arg0.method8300() == 1;
            if (arg1 || !var7) {
                this.field3073.add(new class263((class323) null, var6, var5, (class270) null));
            }
        }
    }
}
