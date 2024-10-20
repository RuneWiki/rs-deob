package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("q")
public class class24 {

    @ObfuscatedName("q.g")
    public int field361;

    @ObfuscatedName("q.m")
    public class79 field364;

    @ObfuscatedName("q.v")
    public DataInputStream field363;

    @ObfuscatedName("q.r")
    public byte[] field372 = new byte[4];

    @ObfuscatedName("q.n")
    public int field366;

    @ObfuscatedName("q.i")
    public byte[] field365;

    @ObfuscatedName("q.s")
    public int field367;

    @ObfuscatedName("q.w")
    public long field368;

    public class24(class74 arg0, URL arg1) {
        this.field364 = arg0.method1494(arg1);
        this.field361 = 0;
        this.field368 = class121.method131() + 30000L;
    }

    @ObfuscatedName("q.g(B)[B")
    public byte[] method197() throws IOException {
        if (class121.method131() > this.field368) {
            throw new IOException();
        }
        if (this.field361 == 0) {
            if (this.field364.field1401 == 2) {
                throw new IOException();
            }
            if (this.field364.field1401 == 1) {
                this.field363 = (DataInputStream) this.field364.field1408;
                this.field361 = 1;
            }
        }
        if (this.field361 == 1) {
            int var1 = this.field363.available();
            if (var1 > 0) {
                if (this.field366 + var1 > 4) {
                    var1 = 4 - this.field366;
                }
                this.field366 += this.field363.read(this.field372, this.field366, var1);
                if (this.field366 == 4) {
                    int var2 = (new class127(this.field372)).method2430();
                    this.field365 = new byte[var2];
                    this.field361 = 2;
                }
            }
        }
        if (this.field361 == 2) {
            int var3 = this.field363.available();
            if (var3 > 0) {
                if (this.field367 + var3 > this.field365.length) {
                    var3 = this.field365.length - this.field367;
                }
                this.field367 += this.field363.read(this.field365, this.field367, var3);
                if (this.field367 == this.field365.length) {
                    return this.field365;
                }
            }
        }
        return null;
    }
}
