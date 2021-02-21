# springcloud-client


oc create role endpointsList --verb=list --resource=endpoints -n antonio-cipollaro-code
oc adm policy add-role-to-user endpointsList system:serviceaccount:antonio-cipollaro-code:default --role-namespace=antonio-cipollaro-code -n antonio-cipollaro-code
oc create role servicesList --verb=list --resource=services -n antonio-cipollaro-code
oc adm policy add-role-to-user servicesList system:serviceaccount:antonio-cipollaro-code:default --role-namespace=antonio-cipollaro-code -n antonio-cipollaro-code
