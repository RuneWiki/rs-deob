package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bh")
public final class class70 implements Runnable {

    @ObfuscatedName("bh.a")
    public InputStream field1260;

    @ObfuscatedName("bh.r")
    public OutputStream field1264;

    @ObfuscatedName("bh.u")
    public Socket field1266;

    @ObfuscatedName("bh.t")
    public boolean field1261 = false;

    @ObfuscatedName("bh.k")
    public class74 field1258;

    @ObfuscatedName("bh.x")
    public class79 field1269;

    @ObfuscatedName("bh.v")
    public byte[] field1262;

    @ObfuscatedName("bh.g")
    public int field1265 = 0;

    @ObfuscatedName("bh.n")
    public int field1268 = 0;

    @ObfuscatedName("bh.q")
    public boolean field1267 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1258 = arg1;
        this.field1266 = arg0;
        this.field1266.setSoTimeout(30000);
        this.field1266.setTcpNoDelay(true);
        this.field1260 = this.field1266.getInputStream();
        this.field1264 = this.field1266.getOutputStream();
    }

    @ObfuscatedName("bh.r(I)V")
    public void method1333() {
        if (this.field1261) {
            return;
        }
        synchronized (this) {
            this.field1261 = true;
            this.notifyAll();
        }
        if (this.field1269 != null) {
            while (this.field1269.field1383 == 0) {
                class127.method1598(1L);
            }
            if (this.field1269.field1383 == 1) {
                try {
                    ((Thread) this.field1269.field1381).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1269 = null;
    }

    public void finalize() {
        this.method1333();
    }

    @ObfuscatedName("bh.u(I)I")
    public int method1323() throws IOException {
        return this.field1261 ? 0 : this.field1260.read();
    }

    @ObfuscatedName("bh.t(S)I")
    public int method1325() throws IOException {
        return this.field1261 ? 0 : this.field1260.available();
    }

    @ObfuscatedName("bh.k([BIII)V")
    public void method1322(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1261) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1260.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bh.x([BIII)V")
    public void method1341(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1261) {
            return;
        }
        if (this.field1267) {
            this.field1267 = false;
            throw new IOException();
        }
        if (this.field1262 == null) {
            this.field1262 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1262[this.field1268] = arg0[arg1 + var5];
                this.field1268 = (this.field1268 + 1) % 5000;
                if ((this.field1265 + 4900) % 5000 == this.field1268) {
                    throw new IOException();
                }
            }
            if (this.field1269 == null) {
                this.field1269 = this.field1258.method1424(this, 3);
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
                        if (this.field1268 == this.field1265) {
                            if (this.field1261) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1265;
                        if (this.field1268 >= this.field1265) {
                            var4 = this.field1268 - this.field1265;
                        } else {
                            var4 = 5000 - this.field1265;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1264.write(this.field1262, var3, var4);
                    } catch (IOException var12) {
                        this.field1267 = true;
                    }
                    this.field1265 = (this.field1265 + var4) % 5000;
                    try {
                        if (this.field1268 == this.field1265) {
                            this.field1264.flush();
                        }
                    } catch (IOException var11) {
                        this.field1267 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1260 != null) {
                        this.field1260.close();
                    }
                    if (this.field1264 != null) {
                        this.field1264.close();
                    }
                    if (this.field1266 != null) {
                        this.field1266.close();
                    }
                } catch (IOException var10) {
                }
                this.field1262 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method184((String) null, var15);
        }
    }
}
