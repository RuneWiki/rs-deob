package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ew")
public final class class144 implements Runnable {

    @ObfuscatedName("ew.s")
    public InputStream field2194;

    @ObfuscatedName("ew.j")
    public OutputStream field2196;

    @ObfuscatedName("ew.p")
    public Socket field2200;

    @ObfuscatedName("ew.x")
    public boolean field2191 = false;

    @ObfuscatedName("ew.d")
    public class137 field2192;

    @ObfuscatedName("ew.u")
    public class147 field2198;

    @ObfuscatedName("ew.o")
    public byte[] field2190;

    @ObfuscatedName("ew.b")
    public int field2195 = 0;

    @ObfuscatedName("ew.k")
    public int field2193 = 0;

    @ObfuscatedName("ew.c")
    public boolean field2197 = false;

    public class144(Socket arg0, class137 arg1) throws IOException {
        this.field2192 = arg1;
        this.field2200 = arg0;
        this.field2200.setSoTimeout(30000);
        this.field2200.setTcpNoDelay(true);
        this.field2200.setReceiveBufferSize(16384);
        this.field2200.setSendBufferSize(16384);
        this.field2194 = this.field2200.getInputStream();
        this.field2196 = this.field2200.getOutputStream();
    }

    @ObfuscatedName("ew.x(B)V")
    public void method2796() {
        if (this.field2191) {
            return;
        }
        synchronized (this) {
            this.field2191 = true;
            this.notifyAll();
        }
        if (this.field2198 != null) {
            while (this.field2198.field2227 == 0) {
                class128.method2294(1L);
            }
            if (this.field2198.field2227 == 1) {
                try {
                    ((Thread) this.field2198.field2225).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2198 = null;
    }

    public void finalize() {
        this.method2796();
    }

    @ObfuscatedName("ew.d(B)I")
    public int method2815() throws IOException {
        return this.field2191 ? 0 : this.field2194.read();
    }

    @ObfuscatedName("ew.u(B)I")
    public int method2798() throws IOException {
        return this.field2191 ? 0 : this.field2194.available();
    }

    @ObfuscatedName("ew.o([BIII)V")
    public void method2797(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2191) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2194.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ew.b([BIIB)V")
    public void method2800(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2191) {
            return;
        }
        if (this.field2197) {
            this.field2197 = false;
            throw new IOException();
        }
        if (this.field2190 == null) {
            this.field2190 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2190[this.field2193] = arg0[arg1 + var5];
                this.field2193 = (this.field2193 + 1) % 5000;
                if ((this.field2195 + 4900) % 5000 == this.field2193) {
                    throw new IOException();
                }
            }
            if (this.field2198 == null) {
                this.field2198 = this.field2192.method2704(this, 3);
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
                        if (this.field2195 == this.field2193) {
                            if (this.field2191) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2195;
                        if (this.field2193 >= this.field2195) {
                            var4 = this.field2193 - this.field2195;
                        } else {
                            var4 = 5000 - this.field2195;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2196.write(this.field2190, var3, var4);
                    } catch (IOException var12) {
                        this.field2197 = true;
                    }
                    this.field2195 = (this.field2195 + var4) % 5000;
                    try {
                        if (this.field2195 == this.field2193) {
                            this.field2196.flush();
                        }
                    } catch (IOException var11) {
                        this.field2197 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2194 != null) {
                        this.field2194.close();
                    }
                    if (this.field2196 != null) {
                        this.field2196.close();
                    }
                    if (this.field2200 != null) {
                        this.field2200.close();
                    }
                } catch (IOException var10) {
                }
                this.field2190 = null;
                break;
            }
        } catch (Exception var15) {
            class149.method1942((String) null, var15);
        }
    }
}
