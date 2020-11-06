package main

import (
    "os"

    "sigs.k8s.io/kustomize/kyaml/fn/framework"
    "sigs.k8s.io/kustomize/kyaml/yaml"
)

var value string

func main() {
    resourceList := &framework.ResourceList{}
    cmd := framework.Command(resourceList, func() error {
        for i := range resourceList.Items {
            if err := resourceList.Items[i].PipeE(yaml.SetAnnotation("value", value)); err != nil {
                return err
            }
        }
        return nil
    })
    cmd.Flags().StringVar(&value, "value", "", "flag value")
    if err := cmd.Excute(); err != nil {
        os.Exit(1)
    }
}
