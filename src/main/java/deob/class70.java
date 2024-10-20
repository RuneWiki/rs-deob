package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bt")
public class class70 extends class57 {

    @ObfuscatedName("bt.n")
    public AudioFormat field1273;

    @ObfuscatedName("bt.d")
    public SourceDataLine field1271;

    @ObfuscatedName("bt.ac")
    public int field1270;

    @ObfuscatedName("bt.ad")
    public byte[] field1272;

    @ObfuscatedName("bt.n(Ljava/awt/Component;)V")
    public void method1086(Component arg0) {
        this.field1273 = new AudioFormat((float) Statics.field1173, 16, Statics.field59 ? 2 : 1, true, false);
        this.field1272 = new byte[0x100 << (Statics.field59 ? 2 : 1)];
    }

    @ObfuscatedName("bt.d(I)V")
    public void method1075(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1273, arg0 << (Statics.field59 ? 2 : 1));
            this.field1271 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1271.open();
            this.field1271.start();
            this.field1270 = arg0;
        } catch (LineUnavailableException var4) {
            if (Statics.method2929(arg0) == 1) {
                this.field1271 = null;
                throw var4;
            } else {
                this.method1075(class126.method2022(arg0));
            }
        }
    }

    @ObfuscatedName("bt.s()I")
    public int method1076() {
        return this.field1270 - (this.field1271.available() >> (Statics.field59 ? 2 : 1));
    }

    @ObfuscatedName("bt.q()V")
    public void method1095() {
        int var1 = 256;
        if (Statics.field59) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1164[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1272[var2 * 2] = (byte) (var3 >> 8);
            this.field1272[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1271.write(this.field1272, 0, var1 << 1);
    }

    @ObfuscatedName("bt.j()V")
    public void method1078() {
        if (this.field1271 != null) {
            this.field1271.close();
            this.field1271 = null;
        }
    }

    @ObfuscatedName("bt.k()V")
    public void method1079() {
        this.field1271.flush();
    }
}
