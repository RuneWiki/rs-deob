package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bh")
public final class class69 implements Runnable {

    @ObfuscatedName("bh.g")
    public InputStream field1269;

    @ObfuscatedName("bh.e")
    public OutputStream field1266;

    @ObfuscatedName("bh.n")
    public Socket field1265;

    @ObfuscatedName("bh.j")
    public boolean field1268 = false;

    @ObfuscatedName("bh.i")
    public class73 field1276;

    @ObfuscatedName("bh.o")
    public class78 field1267;

    @ObfuscatedName("bh.l")
    public byte[] field1271;

    @ObfuscatedName("bh.p")
    public int field1274 = 0;

    @ObfuscatedName("bh.t")
    public int field1273 = 0;

    @ObfuscatedName("bh.w")
    public boolean field1272 = false;

    public class69(Socket arg0, class73 arg1) throws IOException {
        this.field1276 = arg1;
        this.field1265 = arg0;
        this.field1265.setSoTimeout(30000);
        this.field1265.setTcpNoDelay(true);
        this.field1269 = this.field1265.getInputStream();
        this.field1266 = this.field1265.getOutputStream();
    }

    @ObfuscatedName("bh.n(I)V")
    public void method1366() {
        if (this.field1268) {
            return;
        }
        synchronized (this) {
            this.field1268 = true;
            this.notifyAll();
        }
        if (this.field1267 != null) {
            while (this.field1267.field1398 == 0) {
                class125.method2058(1L);
            }
            if (this.field1267.field1398 == 1) {
                try {
                    ((Thread) this.field1267.field1402).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1267 = null;
    }

    public void finalize() {
        this.method1366();
    }

    @ObfuscatedName("bh.j(I)I")
    public int method1368() throws IOException {
        return this.field1268 ? 0 : this.field1269.read();
    }

    @ObfuscatedName("bh.i(S)I")
    public int method1369() throws IOException {
        return this.field1268 ? 0 : this.field1269.available();
    }

    @ObfuscatedName("bh.o([BIII)V")
    public void method1370(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1268) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1269.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bh.l([BIIS)V")
    public void method1371(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1268) {
            return;
        }
        if (this.field1272) {
            this.field1272 = false;
            throw new IOException();
        }
        if (this.field1271 == null) {
            this.field1271 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1271[this.field1273] = arg0[arg1 + var5];
                this.field1273 = (this.field1273 + 1) % 5000;
                if ((this.field1274 + 4900) % 5000 == this.field1273) {
                    throw new IOException();
                }
            }
            if (this.field1267 == null) {
                this.field1267 = this.field1276.method1485(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field1274 == this.field1273) {
                            if (this.field1268) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1274;
                        if (this.field1273 >= this.field1274) {
                            var4 = this.field1273 - this.field1274;
                        } else {
                            var4 = 5000 - this.field1274;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1266.write(this.field1271, var3, var4);
                    } catch (IOException var12) {
                        this.field1272 = true;
                    }
                    this.field1274 = (this.field1274 + var4) % 5000;
                    try {
                        if (this.field1274 == this.field1273) {
                            this.field1266.flush();
                        }
                    } catch (IOException var11) {
                        this.field1272 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1269 != null) {
                        this.field1269.close();
                    }
                    if (this.field1266 != null) {
                        this.field1266.close();
                    }
                    if (this.field1265 != null) {
                        this.field1265.close();
                    }
                } catch (IOException var10) {
                }
                this.field1271 = null;
                break;
            }
        } catch (Exception var15) {
            class79.method126((String) null, var15);
        }
    }
}
