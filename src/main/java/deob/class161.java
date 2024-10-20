package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ff")
public final class class161 implements Runnable {

    @ObfuscatedName("ff.i")
    public OutputStream field2270;

    @ObfuscatedName("ff.j")
    public InputStream field2269;

    @ObfuscatedName("ff.a")
    public Socket field2280;

    @ObfuscatedName("ff.r")
    public boolean field2271 = false;

    @ObfuscatedName("ff.o")
    public class156 field2273;

    @ObfuscatedName("ff.n")
    public class155 field2274;

    @ObfuscatedName("ff.q")
    public byte[] field2275;

    @ObfuscatedName("ff.b")
    public int field2276 = 0;

    @ObfuscatedName("ff.k")
    public int field2272 = 0;

    @ObfuscatedName("ff.s")
    public boolean field2278 = false;

    public class161(Socket arg0, class156 arg1) throws IOException {
        this.field2273 = arg1;
        this.field2280 = arg0;
        this.field2280.setSoTimeout(30000);
        this.field2280.setTcpNoDelay(true);
        this.field2280.setReceiveBufferSize(16384);
        this.field2280.setSendBufferSize(16384);
        this.field2269 = this.field2280.getInputStream();
        this.field2270 = this.field2280.getOutputStream();
    }

    @ObfuscatedName("ff.i(B)V")
    public void method2810() {
        if (this.field2271) {
            return;
        }
        synchronized (this) {
            this.field2271 = true;
            this.notifyAll();
        }
        if (this.field2274 != null) {
            while (this.field2274.field2236 == 0) {
                Statics.method1558(1L);
            }
            if (this.field2274.field2236 == 1) {
                try {
                    ((Thread) this.field2274.field2240).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2274 = null;
    }

    public void finalize() {
        this.method2810();
    }

    @ObfuscatedName("ff.j(I)I")
    public int method2811() throws IOException {
        return this.field2271 ? 0 : this.field2269.read();
    }

    @ObfuscatedName("ff.a(I)I")
    public int method2816() throws IOException {
        return this.field2271 ? 0 : this.field2269.available();
    }

    @ObfuscatedName("ff.r([BIII)V")
    public void method2821(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2271) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2269.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ff.o([BIIB)V")
    public void method2813(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2271) {
            return;
        }
        if (this.field2278) {
            this.field2278 = false;
            throw new IOException();
        }
        if (this.field2275 == null) {
            this.field2275 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2275[this.field2272] = arg0[arg1 + var5];
                this.field2272 = (this.field2272 + 1) % 5000;
                if ((this.field2276 + 4900) % 5000 == this.field2272) {
                    throw new IOException();
                }
            }
            if (this.field2274 == null) {
                this.field2274 = this.field2273.method2770(this, 3);
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
                        if (this.field2276 == this.field2272) {
                            if (this.field2271) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2276;
                        if (this.field2272 >= this.field2276) {
                            var4 = this.field2272 - this.field2276;
                        } else {
                            var4 = 5000 - this.field2276;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2270.write(this.field2275, var3, var4);
                    } catch (IOException var12) {
                        this.field2278 = true;
                    }
                    this.field2276 = (this.field2276 + var4) % 5000;
                    try {
                        if (this.field2276 == this.field2272) {
                            this.field2270.flush();
                        }
                    } catch (IOException var11) {
                        this.field2278 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2269 != null) {
                        this.field2269.close();
                    }
                    if (this.field2270 != null) {
                        this.field2270.close();
                    }
                    if (this.field2280 != null) {
                        this.field2280.close();
                    }
                } catch (IOException var10) {
                }
                this.field2275 = null;
                break;
            }
        } catch (Exception var15) {
            class154.method2746((String) null, var15);
        }
    }
}
