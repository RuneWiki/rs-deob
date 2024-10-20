package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("n")
public class class24 {

    @ObfuscatedName("n.j")
    public int field378;

    @ObfuscatedName("n.r")
    public class79 field364;

    @ObfuscatedName("n.v")
    public DataInputStream field365;

    @ObfuscatedName("n.p")
    public byte[] field366 = new byte[4];

    @ObfuscatedName("n.e")
    public int field367;

    @ObfuscatedName("n.d")
    public byte[] field377;

    @ObfuscatedName("n.y")
    public int field368;

    @ObfuscatedName("n.x")
    public long field370;

    public class24(class74 arg0, URL arg1) {
        this.field364 = arg0.method1486(arg1);
        this.field378 = 0;
        this.field370 = Statics.method2045() + 30000L;
    }

    @ObfuscatedName("n.j(I)[B")
    public byte[] method234() throws IOException {
        if (Statics.method2045() > this.field370) {
            throw new IOException();
        }
        if (this.field378 == 0) {
            if (this.field364.field1394 == 2) {
                throw new IOException();
            }
            if (this.field364.field1394 == 1) {
                this.field365 = (DataInputStream) this.field364.field1391;
                this.field378 = 1;
            }
        }
        if (this.field378 == 1) {
            int var1 = this.field365.available();
            if (var1 > 0) {
                if (this.field367 + var1 > 4) {
                    var1 = 4 - this.field367;
                }
                this.field367 += this.field365.read(this.field366, this.field367, var1);
                if (this.field367 == 4) {
                    int var2 = (new class127(this.field366)).method2446();
                    this.field377 = new byte[var2];
                    this.field378 = 2;
                }
            }
        }
        if (this.field378 == 2) {
            int var3 = this.field365.available();
            if (var3 > 0) {
                if (this.field368 + var3 > this.field377.length) {
                    var3 = this.field377.length - this.field368;
                }
                this.field368 += this.field365.read(this.field377, this.field368, var3);
                if (this.field368 == this.field377.length) {
                    return this.field377;
                }
            }
        }
        return null;
    }
}
