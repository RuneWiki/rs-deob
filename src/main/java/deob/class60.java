package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ba")
public class class60 extends class47 {

    @ObfuscatedName("ba.z")
    public AudioFormat field1156;

    @ObfuscatedName("ba.n")
    public SourceDataLine field1155;

    @ObfuscatedName("ba.ai")
    public int field1154;

    @ObfuscatedName("ba.ac")
    public byte[] field1157;

    @ObfuscatedName("ba.z(Ljava/awt/Component;)V")
    public void method939(Component arg0) {
        this.field1156 = new AudioFormat((float) Statics.field2844, 16, Statics.field1053 ? 2 : 1, true, false);
        this.field1157 = new byte[0x100 << (Statics.field1053 ? 2 : 1)];
    }

    @ObfuscatedName("ba.n(I)V")
    public void method930(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1156, arg0 << (Statics.field1053 ? 2 : 1));
            this.field1155 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1155.open();
            this.field1155.start();
            this.field1154 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1155 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method930(var17);
        }
    }

    @ObfuscatedName("ba.u()I")
    public int method944() {
        return this.field1154 - (this.field1155.available() >> (Statics.field1053 ? 2 : 1));
    }

    @ObfuscatedName("ba.t()V")
    public void method929() {
        int var1 = 256;
        if (Statics.field1053) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1058[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1157[var2 * 2] = (byte) (var3 >> 8);
            this.field1157[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1155.write(this.field1157, 0, var1 << 1);
    }

    @ObfuscatedName("ba.e()V")
    public void method934() {
        if (this.field1155 != null) {
            this.field1155.close();
            this.field1155 = null;
        }
    }

    @ObfuscatedName("ba.a()V")
    public void method933() {
        this.field1155.flush();
    }
}
