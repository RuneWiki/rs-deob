package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("am")
public class class27 {

    @ObfuscatedName("am.d")
    public int field598;

    @ObfuscatedName("am.c")
    public class103 field588;

    @ObfuscatedName("am.n")
    public DataInputStream field595;

    @ObfuscatedName("am.q")
    public byte[] field591 = new byte[4];

    @ObfuscatedName("am.t")
    public int field599;

    @ObfuscatedName("am.p")
    public byte[] field592;

    @ObfuscatedName("am.u")
    public int field593;

    @ObfuscatedName("am.z")
    public long field594;

    public class27(class104 arg0, URL arg1) {
        this.field588 = arg0.method1875(arg1);
        this.field598 = 0;
        this.field594 = class132.method1336() + 30000L;
    }

    @ObfuscatedName("am.d(I)[B")
    public byte[] method576() throws IOException {
        if (class132.method1336() > this.field594) {
            throw new IOException();
        }
        if (this.field598 == 0) {
            if (this.field588.field1654 == 2) {
                throw new IOException();
            }
            if (this.field588.field1654 == 1) {
                this.field595 = (DataInputStream) this.field588.field1658;
                this.field598 = 1;
            }
        }
        if (this.field598 == 1) {
            this.field599 += this.field595.read(this.field591, this.field599, this.field591.length - this.field599);
            if (this.field599 == 4) {
                int var1 = (new class130(this.field591)).method2246();
                this.field592 = new byte[var1];
                this.field598 = 2;
            }
        }
        if (this.field598 == 2) {
            this.field593 += this.field595.read(this.field592, this.field593, this.field592.length - this.field593);
            if (this.field593 == this.field592.length) {
                return this.field592;
            }
        }
        return null;
    }
}
