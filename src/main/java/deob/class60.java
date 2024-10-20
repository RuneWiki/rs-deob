package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bl")
public class class60 extends class58 {

    @ObfuscatedName("bl.ac")
    public AudioFormat field1087;

    @ObfuscatedName("bl.au")
    public SourceDataLine field1089;

    @ObfuscatedName("bl.al")
    public int field1086;

    @ObfuscatedName("bl.ae")
    public byte[] field1088;

    @ObfuscatedName("bl.o(Ljava/awt/Component;I)V")
    public void method1108(Component arg0) {
        this.field1087 = new AudioFormat((float) Statics.field1054, 16, Statics.field1060 ? 2 : 1, true, false);
        this.field1088 = new byte[0x100 << (Statics.field1060 ? 2 : 1)];
    }

    @ObfuscatedName("bl.q(II)V")
    public void method1121(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1087, arg0 << (Statics.field1060 ? 2 : 1));
            this.field1089 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1089.open();
            this.field1089.start();
            this.field1086 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1089 = null;
                throw var11;
            } else {
                this.method1121(class158.method615(arg0));
            }
        }
    }

    @ObfuscatedName("bl.c(I)I")
    public int method1110() {
        return this.field1086 - (this.field1089.available() >> (Statics.field1060 ? 2 : 1));
    }

    @ObfuscatedName("bl.b()V")
    public void method1111() {
        int var1 = 256;
        if (Statics.field1060) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1051[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1088[var2 * 2] = (byte) (var3 >> 8);
            this.field1088[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1089.write(this.field1088, 0, var1 << 1);
    }

    @ObfuscatedName("bl.w(I)V")
    public void method1112() {
        if (this.field1089 != null) {
            this.field1089.close();
            this.field1089 = null;
        }
    }

    @ObfuscatedName("bl.l(I)V")
    public void method1113() {
        this.field1089.flush();
    }
}
