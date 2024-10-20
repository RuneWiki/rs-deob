package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("r")
public class class23 {

    @ObfuscatedName("r.p")
    public int field382;

    @ObfuscatedName("r.j")
    public class78 field378;

    @ObfuscatedName("r.w")
    public DataInputStream field374;

    @ObfuscatedName("r.h")
    public byte[] field375 = new byte[4];

    @ObfuscatedName("r.v")
    public int field376;

    @ObfuscatedName("r.k")
    public byte[] field377;

    @ObfuscatedName("r.g")
    public int field381;

    @ObfuscatedName("r.n")
    public long field373;

    public class23(class73 arg0, URL arg1) {
        this.field378 = arg0.method1476(arg1);
        this.field382 = 0;
        this.field373 = class120.method1322() + 30000L;
    }

    @ObfuscatedName("r.p(I)[B")
    public byte[] method216() throws IOException {
        if (class120.method1322() > this.field373) {
            throw new IOException();
        }
        if (this.field382 == 0) {
            if (this.field378.field1410 == 2) {
                throw new IOException();
            }
            if (this.field378.field1410 == 1) {
                this.field374 = (DataInputStream) this.field378.field1414;
                this.field382 = 1;
            }
        }
        if (this.field382 == 1) {
            int var1 = this.field374.available();
            if (var1 > 0) {
                if (this.field376 + var1 > 4) {
                    var1 = 4 - this.field376;
                }
                this.field376 += this.field374.read(this.field375, this.field376, var1);
                if (this.field376 == 4) {
                    int var2 = (new class126(this.field375)).method2380();
                    this.field377 = new byte[var2];
                    this.field382 = 2;
                }
            }
        }
        if (this.field382 == 2) {
            int var3 = this.field374.available();
            if (var3 > 0) {
                if (this.field381 + var3 > this.field377.length) {
                    var3 = this.field377.length - this.field381;
                }
                this.field381 += this.field374.read(this.field377, this.field381, var3);
                if (this.field381 == this.field377.length) {
                    return this.field377;
                }
            }
        }
        return null;
    }
}
