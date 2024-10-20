package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bb")
public class class63 extends class50 {

    @ObfuscatedName("bb.b")
    public AudioFormat field1181;

    @ObfuscatedName("bb.u")
    public SourceDataLine field1179;

    @ObfuscatedName("bb.az")
    public int field1180;

    @ObfuscatedName("bb.ai")
    public byte[] field1178;

    @ObfuscatedName("bb.b(Ljava/awt/Component;)V")
    public void method917(Component arg0) {
        this.field1181 = new AudioFormat((float) Statics.field1087, 16, Statics.field1075 ? 2 : 1, true, false);
        this.field1178 = new byte[0x100 << (Statics.field1075 ? 2 : 1)];
    }

    @ObfuscatedName("bb.u(I)V")
    public void method919(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1181, arg0 << (Statics.field1075 ? 2 : 1));
            this.field1179 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1179.open();
            this.field1179.start();
            this.field1180 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1179 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method919(var17);
        }
    }

    @ObfuscatedName("bb.x()I")
    public int method920() {
        return this.field1180 - (this.field1179.available() >> (Statics.field1075 ? 2 : 1));
    }

    @ObfuscatedName("bb.j()V")
    public void method930() {
        int var1 = 256;
        if (Statics.field1075) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1074[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1178[var2 * 2] = (byte) (var3 >> 8);
            this.field1178[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1179.write(this.field1178, 0, var1 << 1);
    }

    @ObfuscatedName("bb.o()V")
    public void method929() {
        if (this.field1179 != null) {
            this.field1179.close();
            this.field1179 = null;
        }
    }

    @ObfuscatedName("bb.n()V")
    public void method923() {
        this.field1179.flush();
    }
}
