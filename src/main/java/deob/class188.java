package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("hb")
public class class188 {

    @ObfuscatedName("hb.al")
    public Map field1961 = new HashMap();

    @ObfuscatedName("hb.aj")
    public int field1962 = 0;

    @ObfuscatedName("hb.az")
    public static final class188 field1963 = new class188();

    @ObfuscatedName("pe.ak(I)Lhb;")
    public static class188 method6816() {
        return field1963;
    }

    @ObfuscatedName("hb.al(Lorg/json/JSONObject;ILeb;I)V")
    public void method3450(JSONObject arg0, int arg1, class116 arg2) {
        this.field1961.clear();
        JSONObject var4;
        try {
            var4 = arg0;
            this.field1962 = arg1;
            arg0.getLong("lastfullsyncat");
            arg0.getLong("lastcardupdatedat");
        } catch (Exception var8) {
            return;
        }
        try {
            this.method3458(var4.getJSONArray("crmcomponents"), this.field1962, arg2);
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("hb.aj(Lorg/json/JSONArray;ILeb;I)V")
    public void method3458(JSONArray arg0, int arg1, class116 arg2) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            JSONObject var5 = arg0.getJSONObject(var4);
            if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
                String var6 = var5.getString("platform");
                if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
                    class186 var7 = new class186();
                    try {
                        var7.method3410(var5, arg1, arg2);
                    } catch (Exception var10) {
                    }
                    if (!var7.field1943.isEmpty()) {
                        String var9 = var5.getString("location");
                        this.field1961.put(var9, var7);
                    }
                }
            }
        }
        this.field1961 = this.method3452();
        class326.method2895();
    }

    @ObfuscatedName("hb.az(I)Ljava/util/Map;")
    public Map method3452() {
        HashMap var1 = new HashMap();
        ArrayList var2 = new ArrayList();
        var2.addAll(this.field1961.entrySet());
        boolean var3 = false;
        while (!var3) {
            var3 = true;
            for (int var4 = 0; var4 < var2.size() - 1; var4++) {
                if (((class186) ((Entry) var2.get(var4)).getValue()).method3408() > ((class186) ((Entry) var2.get(var4 + 1)).getValue()).method3408()) {
                    Entry var5 = (Entry) var2.get(var4);
                    var2.set(var4, var2.get(var4 + 1));
                    var2.set(var4 + 1, var5);
                    var3 = false;
                }
            }
        }
        Iterator var6 = var2.iterator();
        while (var6.hasNext()) {
            Entry var7 = (Entry) var6.next();
            var1.put(var7.getKey(), var7.getValue());
        }
        return var1;
    }

    @ObfuscatedName("hb.af(Ljava/lang/String;I)Lhj;")
    public class186 method3460(String arg0) {
        return (class186) this.field1961.get(arg0);
    }
}
