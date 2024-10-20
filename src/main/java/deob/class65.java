package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bg")
public class class65 extends class52 {

    @ObfuscatedName("bg.o")
    public AudioFormat field1208;

    @ObfuscatedName("bg.l")
    public SourceDataLine field1207;

    @ObfuscatedName("bg.aq")
    public int field1209;

    @ObfuscatedName("bg.ay")
    public byte[] field1210;

    @ObfuscatedName("bg.o(Ljava/awt/Component;)V")
    public void method1008(Component arg0) {
        this.field1208 = new AudioFormat((float) Statics.field1685, 16, Statics.field1101 ? 2 : 1, true, false);
        this.field1210 = new byte[0x100 << (Statics.field1101 ? 2 : 1)];
    }

    @ObfuscatedName("bg.l(I)V")
    public void method1009(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1208, arg0 << (Statics.field1101 ? 2 : 1));
            this.field1207 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1207.open();
            this.field1207.start();
            this.field1209 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1207 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method1009(var17);
        }
    }

    @ObfuscatedName("bg.g()I")
    public int method1007() {
        return this.field1209 - (this.field1207.available() >> (Statics.field1101 ? 2 : 1));
    }

    @ObfuscatedName("bg.u()V")
    public void method1011() {
        int var1 = 256;
        if (Statics.field1101) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1102[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1210[var2 * 2] = (byte) (var3 >> 8);
            this.field1210[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1207.write(this.field1210, 0, var1 << 1);
    }

    @ObfuscatedName("bg.q()V")
    public void method1012() {
        if (this.field1207 != null) {
            this.field1207.close();
            this.field1207 = null;
        }
    }

    @ObfuscatedName("bg.r()V")
    public void method1013() {
        this.field1207.flush();
    }
}
